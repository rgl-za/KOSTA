package com.javaex.helloworld;

import java.util.Scanner;

public class switchEX01 {

	public static void main(String[] args) {
		// case 조건 1개 사용

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Java\t 2. C\t 3. C++\t 4. Python\t");
		
		System.out.print("과목 번호: ");
		
		int select = sc.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("R101호 입니다.");
			break;
		case 2:
			System.out.println("R202호 입니다.");
			break;
		case 3: 
			System.out.println("R303호 입니다.");
			break;
		case 4:
			System.out.println("R404호 입니다.");
			break;
		default:
			System.out.println("상담원에게 문의하세요.");
			break;
		}
		
		sc.close();
		
	}

}
