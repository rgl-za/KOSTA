package com.javaex.pratice01;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int deposit, withdraw, balance;
		
		balance = 0;
		while(true) {
			System.out.println("===================================");
			System.out.println("1. 예금\t 2. 출금\t 3. 잔고\t 4. 종료");
			System.out.println("===================================");
			
			System.out.print("선택> ");
			
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.print("예금액> ");
				deposit = sc.nextInt();
				balance += deposit;
			}
			else if(select == 2) {
				System.out.print("출금액> ");
				withdraw = sc.nextInt();
				balance -= withdraw;
			}
			else if(select == 3) {
				System.out.println("잔고액> " + balance);
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
