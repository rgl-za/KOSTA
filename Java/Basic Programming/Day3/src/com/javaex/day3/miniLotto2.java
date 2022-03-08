package com.javaex.day3;

public class miniLotto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Lotto = new int[6];
		
		for(int i=0; i<Lotto.length; i++) {
			int number = (int)(Math.random()*45)+1;
			Lotto[i] = number;
			
			System.out.println(Lotto[i]);
		}

	}

}
