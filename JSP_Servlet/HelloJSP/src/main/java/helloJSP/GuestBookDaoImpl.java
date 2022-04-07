package helloJSP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GuestBookDaoImpl implements GuestbookDao {
	private Connection getConnection() throws SQLException {
	       Connection conn = null;
	       try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
	         conn = DriverManager.getConnection(dburl, "webdb", "1234");
	       } catch (ClassNotFoundException e) {
	         System.err.println("JDBC 드라이버 로드 실패!");
	       }
	       return conn;
	   }
	
	@Override
	public int insert(GuestbookVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int count=0;
		
		try {
			conn = getConnection();
			
			System.out.println(vo.getPassword());
			
			String query = " insert into guestbook values (seq_guestbook_no.nextval, ?, ?, ?, sysdate) ";
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getContent());
//			pstmt.setString(4, vo.getDate());
			
			count = pstmt.executeUpdate();
			
			System.out.println(count + "건 등록");
			
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
		}
		return count;
	}
	
	
	@Override
	public List<GuestbookVo> getList(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<GuestbookVo> list = new ArrayList<GuestbookVo>();

		try {
		  conn = getConnection();
			
			// 3. SQL문 준비 / 바인딩 / 실행
			String query = " select * from guestbook order by reg_date desc";
			pstmt = conn.prepareStatement(query);
			
			rs = pstmt.executeQuery();
			// 4.결과처리
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String content = rs.getString("content");
				String date = rs.getString("REG_DATE");
				
				GuestbookVo vo = new GuestbookVo(no, name, content, date);
				list.add(vo);
			}
			
			
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

		return list;
	}

	@Override
	public int delete(GuestbookVo vo) {
		Connection conn = null;
	    PreparedStatement pstmt = null;
	    int count = 0 ;
	    
	    try {
	      conn = getConnection();
	      System.out.println(vo.getName());
	      System.out.println(vo.getPassword());
	      
	      String query ="delete from guestbook where \"name\" = ? and \"password\" = ? ";
	      pstmt = conn.prepareStatement(query); 
	      
//	      pstmt.setInt(1, vo.getNo());
	      pstmt.setString(1, vo.getName());
	      pstmt.setString(2, vo.getPassword());
	      
	      
	      count = pstmt.executeUpdate();
	      
	      System.out.println(count + "건 삭제");
	      
	    } catch (SQLException e) {
	      System.out.println("error:" + e);
	    } finally {
	      try {
	        if (pstmt != null) pstmt.close();
	        if (conn != null) conn.close();
	      } catch (SQLException e) {
	        System.out.println("error:" + e);
	      }
	    }
	    return count;
	}
}