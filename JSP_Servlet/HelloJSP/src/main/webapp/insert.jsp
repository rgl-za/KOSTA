<%@page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8" %>
   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Request.getParameter() 처리</title>
</head>

<body>
<% 
	request.setCharacterEncoding("utf-8");

	String str = request.getParameter("id");
	String password = request.getParameter("password");
	
	out.println("<span>" + str + "</span> <br>");
	out.println("<span>" + password + "</span> <br>");
%>
</body>
</html>