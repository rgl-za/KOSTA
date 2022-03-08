package com.javaex.helloworld;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 7;
		int B = 3;
		int C = A % B;
		
		System.out.println(C);
		
		////////////////
		
		int num1 = 7;
		int num2;
		
//		num2 = ++num1;
		num2 = num1++;
		
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}

}
