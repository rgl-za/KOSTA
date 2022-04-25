package org.zerock.mapper;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {

  @Setter(onMethod = @__({ @Autowired }))
  private BoardMapper mapper;
  
  @Test
  public void testGetList() {
	  
    mapper.getList().forEach(board -> log.info(board));
  }
  
  @Test
  public void testinsert() {
	  BoardVO board = new BoardVO();
	  board.setTitle("보리의 일기");
	  board.setContent("산책을 갔다");
	  board.setWriter("지보리");
	  
	  mapper.insert(board);
	  
	  log.info(board);
//	  log.warn(board);
  }
}
