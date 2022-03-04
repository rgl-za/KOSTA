package com.javaex.pratice01;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int max = 0;
		int num = 0;
		
		for(int i=0; i<5; i++) {
			System.out.print("숫자: ");
			num = sc.nextInt();
			if(max<num)
				max = num;
		}
		
		System.out.println("최대 값은 "+ max + " 입니다.");
		
		sc.close();
	}

}
