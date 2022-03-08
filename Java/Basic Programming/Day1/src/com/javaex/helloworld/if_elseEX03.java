package com.javaex.helloworld;

import java.util.Scanner;

public class if_elseEX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Java\t 2. C\t 3. C++\t 4. Python\t");
		
		System.out.print("과목 번호: ");
		
		int select = sc.nextInt();
		
		if(select == 1)
			System.out.println("R101호 입니다.");
		
		else if(select == 2)
			System.out.println("R202호 입니다.");
		
		else if(select == 3)
			System.out.println("R303호 입니다.");
		
		else if(select == 4)
			System.out.println("R404호 입니다.");
		
		else 
			System.out.println("상담원에게 문의하세요.");
		
		sc.close();

	}

}
