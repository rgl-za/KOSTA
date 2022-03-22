package com.kosta.post;

import java.sql.*;
import java.util.Scanner;

public class FindPostCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("도로명을 입력해주세요: ");
		String inputString = sc.nextLine();
		if(!inputString.equals(null) || !"".equals(inputString)) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				conn = DriverManager.getConnection(url, "webdb", "1234");
																																														
				String query = "SELECT ZIPCODE, SIDO, DORO, DONG, BUILDINGNO1, BUILDING \r\n" +
						   	   "FROM POST_SEJONG \r\n" +
						       "WHERE DORO LIKE ? ";
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, "%"+inputString+"%");
				rs = pstmt.executeQuery();
				
//				switch(inputNum) { 왜 안될까 미이이
//				case 1: // 도로명
//					String query = "SELECT ZIPCODE, SIDO, DORO, BILDINGNO1, BILDING " +
//								   "FROM POST_SEJONG" +
//								   "WHERE LIKE ?";
//					pstmt = conn.prepareStatement(query);
//					pstmt.setString(1, "%"+inputString+"%");
//					rs = pstmt.executeQuery();
//					break;
//				case 2: // 동명
//					String query = " ";
//					pstmt = conn.prepareStatement(query);
//					pstmt.setString(1, "%"+inputString+"%");
//					rs = pstmt.executeQuery();
//					break;
//				case 3: // 건물명
//					String query = " ";
//					pstmt = conn.prepareStatement(query);
//					pstmt.setString(1, "%"+inputString+"%");
//					rs = pstmt.executeQuery();
//					break;
//				case 4: // 도로명+건물명
//					String query = " ";
//					pstmt = conn.prepareStatement(query);
//					pstmt.setString(1, "%"+inputString+"%");
//					rs = pstmt.executeQuery();
//					break;
//				default:
//					break;
//				
//				} 
				
				while (rs.next()) {
					String ZIPCODE = rs.getString("ZIPCODE");
					String SIDO = rs.getString("SIDO");
					String DONG = rs.getString("DONG");
					String DORO = rs.getString("DORO");
					String BUILDINGNO = rs.getString("BUILDINGNO1");
					String BUILDING = rs.getString("BUILDING");
					System.out.println("우편번호: " + ZIPCODE);
					System.out.println("주소: "+ SIDO + " "+ DORO+ " " +BUILDINGNO+" "+BUILDING+" (" + DONG + ")");
				 }
				}
				catch (ClassNotFoundException e) {
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

}
