package com.javaex.pratice01;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		
		int num = sc.nextInt();
		int sum;
		if(num%2 != 0 ) {
			sum = 0;
			for(int i=1; i<=num; i+=2) {
				sum+=i;
			}
		}
		else {
			sum = 0;
			for(int i=2; i<=num; i+=2) {
				sum+=i;
			}
		}
		System.out.print("결과 값: " + sum);
		
		sc.close();
		
	}

}
