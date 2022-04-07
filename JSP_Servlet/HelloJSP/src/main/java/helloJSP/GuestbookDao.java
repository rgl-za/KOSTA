package helloJSP;

import java.sql.Connection;
import java.util.List;

import helloJSP.GuestbookVo;


public interface GuestbookDao {
	
	public List<GuestbookVo> getList();

	public int insert(GuestbookVo vo);

	public int delete(GuestbookVo vo);

}
