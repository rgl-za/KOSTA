package com.javaex.day2;

public class whileEX02 {

	public static void main(String[] args) {		
		
		// 6의 배수이자 14의 배수인 가장 적은 정수 찾기  
		int i = 1;
		while(true) {
			if(i%6==0 && i%14==0) {
				System.out.println(i);
				break;
			}
			i++;
		}
	}

}
