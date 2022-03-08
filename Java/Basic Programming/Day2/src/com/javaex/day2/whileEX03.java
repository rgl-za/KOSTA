package com.javaex.day2;

public class whileEX03 {

	public static void main(String[] args) {
		
		// 6의 배수이자 14의 배수인 가장 적은 정수 10개 찾기  
		
		int count = 0;
		int i=1;
		while(count<10) {
			if(i%6==0 && i%14==0) {
				count++;
				System.out.println(i);
			}
			i++;
		}

	}

}
