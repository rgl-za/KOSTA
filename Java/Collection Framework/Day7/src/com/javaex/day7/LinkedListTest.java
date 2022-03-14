package com.javaex.day7;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		// 데이터를 앞뒤 둘 다 삽입 가능
		
		System.out.println(list);
		
		list.addFirst(1);
		System.out.println(list);
		
		list.add(2);
		System.out.println(list);
		
		list.addFirst(3);
		System.out.println(list);
		
		list.add(1,10);
		System.out.println(list);
		
		
		
		list.addLast(100);
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		
		System.out.println(list.size());
		
		// 향상된 for문
		for(Integer i: list) {
			System.out.println(i);
		}
		
		System.out.println(list.contains(100));
		System.out.println(list.indexOf(100));

	}

}
