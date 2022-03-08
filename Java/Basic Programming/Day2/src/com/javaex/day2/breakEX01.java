package com.javaex.day2;

import java.util.Scanner;

public class breakEX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력: ");
			int num = sc.nextInt(); // 키보드 입력 대기 상태
			
			if(num == 0) {
				System.out.println("종료");
				break;
			}
			else if(num % 3 != 0) {
				System.out.println("3의 배수 아님");
				continue;
			}
			else if(num % 3 == 0) {
				System.out.println("3의 배수");
				continue;
			}
		}
		
		sc.close();

	}

}
