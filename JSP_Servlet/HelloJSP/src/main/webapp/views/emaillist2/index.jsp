<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="vo.EmaillistVo"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%
    List<EmaillistVo> list = (List<EmaillistVo>)request.getAttribute("list");
%>

<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>email list</title>
</head>
<body>

<h1>메일 리스트 가입</h1>
  <p>
    메일 리스트에 가입하려면,<br> 아래 항목을 기입하고 submit 버튼을 클릭하세요.
  </p>
  <form action="/helloJSP/views/emaillist2" method="post">
  <input type="hidden" name="a" value="add">
    Last name(성): <input type="text" name="ln" value=""><br>
    First name(이름): <input type="text" name="fn" value=""><br>
    Email address: <input type="text" name="email" value=""><br>
    <input type="submit" value="등록">
  </form>
  <br>
  <p>
    <a href="/helloJSP/views/emaillist2">리스트 바로가기</a>
  </p>
  

  <br>
  <table width="510" border="1">
    <tr>
      <th> 등록번호 </th>
      <th> 성 </th>
      <th> 이름 </th>
      <th> 이메일 </th>
      <th>  </th>
    </tr>
    
   
  
<% if(list != null){
    for(EmaillistVo vo : list){ %>
    <tr>
        <td><%= vo.getNo() %></td>
        <td><%= vo.getLastName() %></td>
        <td><%= vo.getFirstName() %></td>
        <td><%= vo.getEmail() %></td>
        <td><a href="/helloJSP/views/emaillist2?a=delete&no=<%=vo.getNo()%>">삭제</a></td>
    </tr>
  <% } %>
<% } %>
  </table>
  <br>
</body>
</html>