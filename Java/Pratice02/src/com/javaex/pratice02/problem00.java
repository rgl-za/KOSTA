package com.javaex.pratice02;

import java.util.Scanner;

public class problem00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		int bank[] = {0,0,0};
		// deposit, withdraw, balance

		while(true) {
			System.out.println("===================================");
			System.out.println("1. 예금\t 2. 출금\t 3. 잔고\t 4. 종료");
			System.out.println("===================================");
			
			System.out.print("선택> ");
			
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.print("예금액> ");
				bank[0] = sc.nextInt();
				bank[2] += bank[0];
			}
			else if(select == 2) {
				System.out.print("출금액> ");
				bank[1] = sc.nextInt();
				if(bank[2] < bank[1]) { 
					System.out.println("잔액이 부족합니다.");
					break;
				}
				bank[2] -= bank[1];
			}
			else if(select == 3) {
				System.out.println("잔고액> " + bank[2]); 
			}
			else if(select == 4) {
				System.out.print("프로그램 종료");
				break;
			}
			else
				System.out.println("다시 입력해주세요.");
			
		}
		sc.close();
	}

}
