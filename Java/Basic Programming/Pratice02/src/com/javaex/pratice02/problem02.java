package com.javaex.pratice02;

import java.util.Scanner;

public class problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int sum;
		int[] avg = new int[5];
		
		for(int i=0; i<5; i++) {
			int num = sc.nextInt();
			avg[i] = num;
		}
		
		sum = 0;
		for(int i=0; i<avg.length; i++) {
			sum+=avg[i];
		}
		System.out.println("평균은 " + (float)sum/avg.length + "입니다.");
		
		sc.close();
	}
	
}
