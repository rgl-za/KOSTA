package com.kosta.jdbc;

import java.sql.*;

public class BookUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null; // 데이터베이스를 연동할 객체 
		PreparedStatement pstmt = null; // sql을 넣고 실행할 객체 
		
		try {
		      // 1. JDBC 드라이버 (Oracle) 로딩
		      Class.forName("oracle.jdbc.driver.OracleDriver");

		      // 2. Connection 얻어오기
		      // 예시는 로컬, 로컬이 아니라면 oracle ip와 포트번호, 서비스 아이디를 알아야함
		      String url = "jdbc:oracle:thin:@localhost:1521:xe";
		      conn = DriverManager.getConnection(url, "webdb", "1234");
		      
		      // 3. SQL문 준비 / 바인딩 / 실행
		      String query = " UPDATE book SET pubs=(?) WHERE author_id = 11";
		      pstmt = conn.prepareStatement(query);

		      // 바인딩
		      pstmt.setString(1, "장유1동");
		      
		      int count = pstmt.executeUpdate(); // insert, update, delete

		      // 4.결과처리
		      System.out.println(count + "건 처리");

		    } catch (ClassNotFoundException e) {
		        System.out.println("error: 드라이버 로딩 실패 - " + e);
		    } catch (SQLException e) {
		        System.out.println("error:" + e);
		    } finally {
		        // 5. 자원정리
		        try {                
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
