<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ page import="helloJSP.GuestbookDao"%>
<%@ page import="helloJSP.GuestbookVo"%>
<%@ page import="helloJSP.GuestBookDaoImpl" %>

<% 
	request.setCharacterEncoding("UTF-8");
	int no = Integer.parseInt(request.getParameter("no"));
	String name = request.getParameter("id");
	String password = request.getParameter("password");
	
	//out.println(no);
	
  	GuestBookDaoImpl Impl = new GuestBookDaoImpl();
  	
  	GuestbookVo vo = new GuestbookVo(no, name, password);
  	//System.out.println(vo);
	Impl.delete(vo);
  
	response.sendRedirect("list.jsp");
%>
