package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardMapper {
  
  //@Select("select * from tbl_board where bno > 0")
  public List<BoardVO> getList();
  
  public List<BoardVO> getListWithPaging(Criteria cri);
  
  public void insert(BoardVO board);
  
  public void insertSelectKey(BoardVO board);
  
  //조회(게시글 조회) 
  public BoardVO read(Long bno);
  
  //삭제 
  public int delete(Long bno);
  
  //수정
  public int update(BoardVO board);
  
  // 게시글 전체 건수 체크 ( 페이징을 위해 필요한 정보 )
  public int getTotalCount(Criteria cri);
  
}
