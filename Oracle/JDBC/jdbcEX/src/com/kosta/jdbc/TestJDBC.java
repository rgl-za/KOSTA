package com.kosta.jdbc;

import java.sql.*;

public class TestJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// import java.sql.*;
		Connection conn = null; // 데이터베이스를 연동할 객체 
		PreparedStatement pstmt = null; // sql을 넣고 실행할 객체 
		ResultSet rs = null; // 데이터가 있을 때 데이터를 가져오는 객체 
		
		try {
		      // 1. JDBC 드라이버 (Oracle) 로딩
		      Class.forName("oracle.jdbc.driver.OracleDriver");

		      // 2. Connection 얻어오기
		      // 예시는 로컬, 로컬이 아니라면 oracle ip와 포트번호, 서비스 아이디를 알아야함
		      String url = "jdbc:oracle:thin:@localhost:1521:xe";
		      conn = DriverManager.getConnection(url, "webdb", "1234");
		      
		      // 3. SQL문 준비 / 바인딩 / 실행
		      String sql = " select * from author ";
		      pstmt = conn.prepareStatement(sql);

		      rs = pstmt.executeQuery();

		      // 4.결과처리
		      while (rs.next()) {
		          int authorId = rs.getInt("author_id");
		          String authorName = rs.getString("author_name");
		          String authorDesc = rs.getString("author_desc");
		          System.out.println(authorId + "\t" + authorName + "\t" + authorDesc + "\t");
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
		

	}

}
