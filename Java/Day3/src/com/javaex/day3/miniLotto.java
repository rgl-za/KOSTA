package com.javaex.day3;

public class miniLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<6; i++) {
			int number = (int)(Math.random()*45)+1;
			System.out.println(number);
		}
	}
}
