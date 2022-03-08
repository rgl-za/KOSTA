package com.javaex.helloworld;

import java.util.Scanner;

public class scannerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.println("당신의 이름은 " + name + ", 나이는 " + age + "세 입니다.");
		
		sc.close();
		
	}

}
