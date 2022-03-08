package com.javaex.day2;

import java.util.Scanner;

public class switchEX02 {

	public static void main(String[] args) {
		// case 조건 여러 개 사용
		
		Scanner sc = new Scanner(System.in);

		System.out.print("월을 입력하세요: ");

		int month = sc.nextInt();

		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("31일 입니다.");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("30일 입니다.");
				break;
			default:
				System.out.println("28일 또는 29일 입니다.");
				break;
		}

		sc.close();

	}

}
