package com.javaex.pratice01;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("===================\n[숫자 맞추기 게임 시작]\n===================\n");
		
		String answer;
		int num;
		int random= (int)(Math.random()*100)+1;
		
		while(true) {
			System.out.print(">> ");
			num = sc.nextInt();
			
			if(num>random)
				System.out.println("더 낮게");
			else if(num<random)
				System.out.println("더 높게");
			else {
				System.out.println("맞았습니다.");
				break;
			}
		}
		sc.nextLine();
		System.out.println("게임을 종료하시겠습니까? (y/n)");
		answer = sc.next();
		// string은 객체지향이라 equlal 연산이 아니라 메소드를 써야함
		if("y".equals(answer)) { // answer.equals("y")
			System.out.println("게임 종료");
			break;
		}
		
		}
		sc.close();
	}
}

