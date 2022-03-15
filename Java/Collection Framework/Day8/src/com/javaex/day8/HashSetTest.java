package com.javaex.day8;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> set = new HashSet<Integer>(); //HashSet 생성
		System.out.println(set);
		
		set.add(1);
		set.add(2);
		set.add(10);
		System.out.println(set);
		
		set.remove(1); // 값 1 제거
		System.out.println(set);
		
		// set.clear(); // 모든 값 제거
		
		
		System.out.println(set.size()); // 크기 출력
		
		// 순서가 없으므로 for문으로 출력 불가능
		// iterator를 이용하여 값을 출력해야 함
		Iterator iter = set.iterator(); // Iterator 사용
		
		while(iter.hasNext()) { // 값이 있으면 true, 없으면 false 
			System.out.println(iter.next());
			
		}
	}

}
