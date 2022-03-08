package com.javaex.day2;

import java.util.Scanner;

public class whileEX01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단을 입력하세요.\n단: ");
		
		int num = sc.nextInt();
		
		int i = 1;
		
		while(i<=9) {
			System.out.println(num + "*" + i + "=" + num*i);
			i++;
		}
		
		sc.close();
	}
	
}
