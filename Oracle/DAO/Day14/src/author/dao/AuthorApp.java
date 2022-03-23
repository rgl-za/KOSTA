package author.dao;

import java.util.List;

public class AuthorApp {

  public static void main(String[] args) {
    // 인터페이스 레퍼런스 변수에 구현클래스의 객체 만들기
    AuthorDao dao = new AuthorDaoImpl();
    
    AuthorVo in_vo = new AuthorVo();
    AuthorVo up_vo = new AuthorVo();
    
    long author_id = 0;
    
    // 1. 만들어진 객체의 select() 호출
    List<AuthorVo> list = dao.select();
    
    // for each 문으로 모든 데이터 출력
//    System.out.println("select");
    for(AuthorVo p_vo : list) {
      System.out.println(p_vo);
    }
    
    // 2. 만들어진 객체의 insert() 호출
    
    in_vo.setAuthor_id(25);
    in_vo.setAuthor_name("test");
    in_vo.setAuthor_desc("testtt");
    
    dao.insert(in_vo);
    
//    System.out.println("insert");
//    for(AuthorVo p_vo : list) {
//        System.out.println(p_vo);
//      }
    
    // 3. 만들어진 객체의 update() 호출
    up_vo.setAuthor_name("test");
    up_vo.setAuthor_desc("test");
    up_vo.setAuthor_id(25);
    
    dao.update(up_vo);
    
//    System.out.println("update");
//    for(AuthorVo p_vo : list) {
//        System.out.println(p_vo);
//      }
    
    // 4. 만들어진 객체의 delete() 호출
    author_id = 25;
    
    dao.delete(author_id);
    
//    System.out.println("delete");
//    for(AuthorVo p_vo : list) {
//        System.out.println(p_vo);
//      }
  }

}

