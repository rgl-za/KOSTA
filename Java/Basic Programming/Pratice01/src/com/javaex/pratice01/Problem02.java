package com.javaex.pratice01;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++){
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}
		
		sc.close();

	}
}
