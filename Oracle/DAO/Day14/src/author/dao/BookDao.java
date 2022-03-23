package author.dao;

import java.util.List;

import author.dao.AuthorVo;
import author.dao.BookVo;

public interface BookDao {
  public List<BookVo> select() ;
  
  List<BookVo> getList();
  public List<BookVo> getList(String text);
  public BookVo get(String id);
  public boolean insert(BookVo authorVo);
  public boolean delete(Long id);
  public boolean update(BookVo authorVo);


  
}

