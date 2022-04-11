package controller;

import java.io.Console;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GuestbookDao;
import dao.GuestbookDaoImpl;
import vo.GuestbookVo;
import dao.*;

@WebServlet(description = "guestbook 서블릿", urlPatterns = {"/views"})
public class GuestbookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public GuestbookServlet() {
      super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("GuestBookServlet.doGet() 호출");
      request.setCharacterEncoding("utf-8");

      String actionName = request.getParameter("a");
      
      if("deleteform".equals(actionName)) {

    	  System.out.println("actionName => " + actionName);    
    	  RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/guestbook/deleteform.jsp");
    	  rd.forward(request, response);
      }
      else if("add".equals(actionName)) {
    	  
    	  System.out.println("actionName => " + actionName);
          
    	  request.setCharacterEncoding("utf-8");
    	  // add action 작성
        
    	  String name = request.getParameter("name");
    	  String password = request.getParameter("password");
    	  String content = request.getParameter("content");
       
    	  GuestbookVo vo = new GuestbookVo(name, password, content);
          
    	  GuestbookDaoImpl dao = new GuestbookDaoImpl();
          dao.insert(vo);
        
          response.sendRedirect("/WEB-INF/views/guestbook/");
      }else if("delete".equals(actionName)) {
    	  
    	  System.out.println("actionName => " + actionName);
    	  request.setCharacterEncoding("utf-8");
    	  // delete action 작성
        
    	  int no = Integer.parseInt(request.getParameter("no"));
//    	  String name = request.getParameter("name");
    	  String password = request.getParameter("password");
    	  String dbpass = request.getParameter("dbpass");
          
    	  if(password.equals(dbpass)) {
    		   GuestbookVo vo = new GuestbookVo(no, password);
    		   GuestbookDaoImpl dao = new GuestbookDaoImpl();
    		   dao.delete(vo);
    	  } else {
    		 System.out.println("비밀번호 다름");
    	  }
        
          response.sendRedirect("/WEB-INF/views/guestbook/");
      }else {
    	  System.out.println("actionName => " + actionName);
    	  GuestbookDao dao = new GuestbookDaoImpl();
    	  List<GuestbookVo> list = dao.getList();

    	  request.setAttribute("list", list);

    	  RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/guestbook/list.jsp");
    	  rd.forward(request, response);
      	}
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}