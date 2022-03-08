package com.javaex.day2;

import java.util.Scanner;

public class dowhileEX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요. [0이면 종료]");
		
		int sum = 0, num;

		do {
			num = sc.nextInt();
			sum+=num;
			System.out.println("합계: " + sum);
			
			
		} while(num != 0);
		
		sc.close();
	}

}
