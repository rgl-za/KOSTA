package com.javaex.day7;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(3); //값 추가
		System.out.println(list);
		
		list.add(null); //null값도 add가능
		System.out.println(list);
		
		list.add(1,10); //index 1에 10 삽입
		System.out.println(list);
		
		// 지우기
//		list.remove(2);
//		System.out.println(list);
//		
//		list.clear();
//		System.out.println(list);
//		
//		
//		System.out.println(list.size());
		
		System.out.println("");
		
		System.out.println(list.get(1));
//		범위 넘어가면 예외 발생
		
		System.out.println("");
		
		for(Integer i: list) {
			System.out.println(i);
		}
		
		Iterator iter = list.iterator(); // Iterator 선언
		while(iter.hasNext()) { // 다음 값이 있는지 체크
			System.out.println(iter.next()); // 값 출력
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println(list.contains(1)); // list에 1이 있는지 검색, true/false
		System.out.println(list.contains(10));
		
		System.out.println(list.indexOf(1)); // 1이 있는 index 반환, 없으면 -1

	}

}
