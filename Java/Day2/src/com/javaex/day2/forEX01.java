package com.javaex.day2;

import java.util.Scanner;

public class forEX01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단을 입력하세요.\n단: ");
		
		int num = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(num + "*" + i + "=" + num*i);
		}
		
		sc.close();
	}
}
