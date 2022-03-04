package com.javaex.day2;

import java.util.Scanner;

public class conditionalEX {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		
		int score = sc.nextInt();
		
		if(score>=90)
			System.out.println("A");
		else if(80<=score)
			System.out.println("B");
		else if(70<=score)
			System.out.println("C");
		else if(60<=score)
			System.out.println("D");
		else
			System.out.println("F");
			
		sc.close();

	}

}
