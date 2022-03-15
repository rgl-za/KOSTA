package com.javaex.day8;

import java.util.HashSet;
import java.util.Iterator;

public class MiniLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<6; i++) {
			int number = (int)(Math.random()*45)+1;
			set.add(number);
		}
		
		Iterator iter = set.iterator(); // Iterator 사용
		
		while(iter.hasNext()) { // 값이 있으면 true, 없으면 false 
			System.out.print(iter.next()+" ");
			
		}
	}

}
