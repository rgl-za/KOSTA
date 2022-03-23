package author.dao;

import java.util.List;
import java.util.Scanner;

public class BookApp {

  public static void main(String[] args) {
    // 인터페이스 레퍼런스 변수에 구현클래스의 객체 만들기
	BookDao dao = new BookDaoImpl();
    
    BookVo in_vo = new BookVo();
    BookVo up_vo = new BookVo();
    
//    long author_id = 0;
    
    Scanner sc = new Scanner(System.in);
    
    // 1. 만들어진 객체의 select() 호출
    
    List<BookVo> list = dao.select();
    
    // for each 문으로 모든 데이터 출력
    System.out.println("보유하고 있는 책 목록");
    for(BookVo p_vo : list) {
      System.out.println(p_vo);
    }
    
    // 임시로 막아두기 -------------------
    
    // 2. 만들어진 객체의 insert() 호출
    
//    in_vo.setTitle("test");
//    in_vo.setPubs("test");
//    in_vo.setPub_date("20220305");
//    in_vo.setAuthor_id(1);
//    
//    dao.insert(in_vo);
    
//    System.out.println("insert");
//    for(AuthorVo p_vo : list) {
//        System.out.println(p_vo);
//      }
    
    // 3. 만들어진 객체의 update() 호출
//    up_vo.setTitle("test22");
//    up_vo.setPubs("test22");
//    up_vo.setAuthor_id(1);
//    
//    dao.update(up_vo);
    
//    System.out.println("update");
//    for(AuthorVo p_vo : list) {
//        System.out.println(p_vo);
//      }
    
    // 4. 만들어진 객체의 delete() 호출
//    author_id = 1;
//    
//    dao.delete(author_id);
    
//    System.out.println("delete");
//    for(AuthorVo p_vo : list) {
//        System.out.println(p_vo);
//      }
    // -----------------------------------
    
    System.out.print("키워드를 입력해주세요: ");
    String input = sc.nextLine();
    for(BookVo p_vo : dao.getList(input)) {
        System.out.println(p_vo);
      }
    
    
  }

}

