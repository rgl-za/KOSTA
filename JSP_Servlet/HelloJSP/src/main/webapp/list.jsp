<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="helloJSP.GuestbookVo"%>
<%@ page import="helloJSP.GuestBookDaoImpl"%>
<%@ page import="java.util.List"%>

<% 
	GuestBookDaoImpl Impl = new GuestBookDaoImpl();
	List<GuestbookVo> list = Impl.getList();
	System.out.println(list.toString());
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>
	<form action="add.jsp" method=post>
	<table border=1 width=500>
		<tr>
			<td>이름</td><td><input type="text" name="name"></td>
			<td>비밀번호</td><td><input type="password" name="pass"></td>
		</tr>
		<tr>
			<td colspan=4><textarea name="content" cols=60 rows=5></textarea></td>
		</tr>
		<tr>
			<td colspan=4 align=right><input type="submit" VALUE=" 확인 "></td>
		</tr>
	</table>
	</form>
	<br/>

	<% 
		for(GuestbookVo vo: list){
	%>
	<table width=510 border=1>
		<tr>
			<td><%= vo.getNo() %></td>
			<td><%= vo.getName() %></td>
			<td><%= vo.getDate() %></td>
			<td><a href="deleteForm.jsp?no=<%= vo.getNo()%>&name=<%= vo.getName()%>" >삭제</a></td>
		</tr>
		<tr>
			<td colspan=4><%= vo.getContent() %></td>
		</tr>
	</table>
        <br/>
	<% 
		}
	%>
</body>
</html>