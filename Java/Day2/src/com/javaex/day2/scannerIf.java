package com.javaex.day2;

import java.util.Scanner;

public class scannerIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		
		int num = sc.nextInt();
		
		if(num % 3 == 0)
			System.out.println(num + "은/는 3의 배수 입니다.");
		else
			System.out.println(num + "은/는 3의 배수가 아닙니다.");
		
		sc.close();

	}
}
