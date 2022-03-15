package com.javaex.problem01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
			
			System.out.print(">> ");
			Scanner sc = new Scanner(System.in);
			
			int a=0;
			String sign = "";
			int b=0;
			
			try {
				a = sc.nextInt();
				sign = sc.next();
				b = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("종료합니다..");
				break;
			}
			
			switch(sign) {
			case "+":
				Add add = new Add();
				add.setValue(a,b);
				System.out.println(">> "+add.calculate());
				break;
			case "-":
				Sub sub = new Sub();
				sub.setValue(a, b);
				System.out.println(">> "+sub.calculate());
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(a,b);
				System.out.println(">> "+mul.calculate());
				break;
			case "/":
				Div div = new Div();
				div.setValue(a,b);
				System.out.println(">> "+div.calculate());
				break;
			default:
				System.out.println("알 수 없는 연산입니다.");
				break;
				
			}
				
		}
	
	}
}
