<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello jsp</title>
</head>
<body>
<% 
int i=1;
int j=2;
int sum = i+j;
%>
<h1><%= sum %></h1>
</body>
</html>