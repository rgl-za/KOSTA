package com.javaex.helloworld;

import java.util.Scanner;

public class if_elseEX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		
		int num = sc.nextInt();
		
		if (num > 0)
			System.out.println("양수 입니다.");
		
		else if (num == 0)
			System.out.println("0은 0 입니다.");
		
		else
			System.out.println("음수 입니다.");
		
		sc.close();

	}

}
