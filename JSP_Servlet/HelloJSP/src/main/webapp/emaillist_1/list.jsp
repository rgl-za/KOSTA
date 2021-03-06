<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! //변수 선언
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String user = "webdb";
	String pass = "1234";
	
	String sql = " SELECT * FROM EMAILLIST";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>메일 리스트에 가입되었습니다.</h1>
	<p>입력한 정보 내역입니다.</p>
	<!-- 메일정보 리스트 -->
	<%-- list에서 하나씩 빼서 테이블를 채운다--%>
	<%
	try{
		//Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDirverz");  //MS-sql
		//Class.forName("org.gjt.mm.msql.Driver");  //mySql
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, user, pass);
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
	
	while(rs.next()){ %>
	<table border="1" cellpadding="5" cellspacing="2">
		<tr>
			<td align=right width="110">Last name: </td>
			<td width="170"><% out.print(rs.getString("last_name")+"\n");%></td>
		</tr>
		<tr>
			<td align=right >First name: </td>
			<td><% out.print(rs.getString("first_name")+"\n");%></td>
		</tr>
		<tr>
			<td align=right>Email address: </td>
			<td><% out.print(rs.getString("email")+"\n");%></td>
		</tr>
		</br>
		<%} 
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs != null) 	 rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	%>
	</table>
	<br>
	<p>
		<a href="form.jsp">추가메일 등록</a>
	</p>
	<br>
</body>
</html>