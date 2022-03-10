package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Friend[] friendArray = new Friend[3];
        
	    Scanner sc = new Scanner(System.in);
	    System.out.println("친구를 3명 등록해 주세요");
	      
	    // 친구정보 입력받기
	    String str1 = sc.nextLine();
	    String str2 = sc.nextLine();
	    String str3 = sc.nextLine();
	    
	    
	      // 입력받은 친구정보를 공백으로 분리 String 클래스에 split(" ") -> array로 넘어감... 명시
	    String[] arr1 = str1.split(" ");
	    String[] arr2 = str2.split(" ");
	    String[] arr3 = str3.split(" ");

	      
	      // Friend 객체 생성하여 데이터 넣기 -> 생성자 호출 -> 객체 생성
	    Friend f1 = new Friend(arr1[0], arr1[1], arr1[2]);
	    Friend f2 = new Friend(arr2[0], arr2[1], arr2[2]);
	    Friend f3 = new Friend(arr3[0], arr3[1], arr3[2]);

	     // 배열에 추가하기 ( friendArray <- friend객체 )
	    friendArray[0] = f1;
	    friendArray[1] = f2;
	    friendArray[2] = f3;
 
	      
	      // 친구정보 출력
	    for (int i = 0; i < friendArray.length; i++) {
	      //친구정보 출력 메소드 호출
	      friendArray[i].showInfo();
	        }
	      sc.close();
	    }


		
}

