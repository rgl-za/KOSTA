<%@page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.SQLException" %>

<%! 
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;

String url = "jdbc:oracle:thon:@localhost:1521:XE";
String user = "hr";
String pass = "hr";

String sql = " SELECT e.EMPLOYEE_ID, e.FIRST_NAME, e.HIRE_DATE, d.DEPARTMENT_NAME , e2.FIRST_NAME as m, e.SALARY " +
		     " FROM EMPLOYEES e, EMPLOYEES e2, DEPARTMENTS d " +
             " WHERE e.MANAGER_ID = e2.EMPLOYEE_ID and e.DEPARTMENT_ID = d.DEPARTMENT_ID " +
			 " ORDER BY e.EMPLOYEE_ID ";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello jsp</title>
</head>
<body>
	<table width="800" border="1">
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>입사일</th>
			<th>근무부서</th>
			<th>매니저</th>
			<th>급여</th>
		</tr>
		<%
		try {
		      // 1. JDBC 드라이버 (Oracle) 로딩
		      Class.forName("oracle.jdbc.driver.OracleDriver");

		      // 2. Connection 얻어오기
		      // 예시는 로컬, 로컬이 아니라면 oracle ip와 포트번호, 서비스 아이디를 알아야함
		      String url = "jdbc:oracle:thin:@localhost:1521:xe";
		      conn = DriverManager.getConnection(url, "hr", "hr");
		      
		      // 3. SQL문 준비 / 바인딩 / 실행
		      String sql = " SELECT e.EMPLOYEE_ID, e.FIRST_NAME, e.HIRE_DATE, d.DEPARTMENT_NAME , e2.FIRST_NAME as m, e.SALARY " +
			 			   " FROM EMPLOYEES e, EMPLOYEES e2, DEPARTMENTS d " +
			               " WHERE e.MANAGER_ID = e2.EMPLOYEE_ID and e.DEPARTMENT_ID = d.DEPARTMENT_ID " +
			 			   " ORDER BY e.EMPLOYEE_ID ";
		      pstmt = conn.prepareStatement(sql);

		      rs = pstmt.executeQuery();

		      // 4.결과처리
		      while(rs.next()){
		    	  int empId = rs.getInt("EMPLOYEE_ID");
		          String empName = rs.getString("FIRST_NAME");
		          String hDate = rs.getString("HIRE_DATE");
		          String dName = rs.getString("DEPARTMENT_NAME");
		          String magName = rs.getNString("m");
		          int salary = rs.getInt("SALARY");
		          
		          System.out.println(empId + "\t" + empName + "\t" + hDate + "\t" + dName + "\t" + magName + "\t" + salary);
		          
		    	  
		          out.print("<tr>");
		          out.print("<td>"+empId+"</td>");
		          out.print("<td>"+empName+"</td>");
		          out.print("<td>"+hDate+"</td>");
		          out.print("<td>"+dName+"</td>");
		          out.print("<td>"+magName+"</td>");
		          out.print("<td>"+salary+"</td>");
		          out.print("</tr>");
		       }

		    } catch (ClassNotFoundException e) {
		        System.out.println("error: 드라이버 로딩 실패 - " + e);
		    } catch (SQLException e) {
		        System.out.println("error:" + e);
		    } finally {
		        // 5. 자원정리
		        try {
		            if (rs != null) {
		                rs.close();
		            }                
		            if (pstmt != null) {
		                pstmt.close();
		            }
		            if (conn != null) {
		                conn.close();
		            }
		        } catch (SQLException e) {
		            System.out.println("error:" + e);
		        }
		    }
		%>
	</table>
</body>
</html>