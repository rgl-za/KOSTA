package com.javaex.day6;

import java.util.Scanner;

public class ArithException {
		public static void main(String[] args) {
		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		try{
			result = 100/num; // java.lang.ArithmeticException 발
		} catch(Exception e) {
			System.out.println("실행 중 에러 발생!!!!!"+e.getMessage());
			result = 0;
		} finally {
			
		}
		
		System.out.println(result); // 예외 발생으로 수행되지 않음 
		
		sc.close();
		} 
}