<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ page import="helloJSP.GuestbookDao"%>
<%@ page import="helloJSP.GuestbookVo"%>
<%@ page import="helloJSP.GuestBookDaoImpl"%>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.ZoneId" %>

<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String password = request.getParameter("pass");
	String content = request.getParameter("content");
	/* String date = request.getParameter("content"); */
	
	GuestbookVo vo = new GuestbookVo(name, password, content);
	
	GuestBookDaoImpl Impl = new GuestBookDaoImpl();
	Impl.insert(vo);
	
	response.sendRedirect("list.jsp");
%>