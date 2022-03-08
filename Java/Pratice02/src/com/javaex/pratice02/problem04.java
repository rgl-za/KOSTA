package com.javaex.pratice02;

import java.util.Scanner;

public class problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int remain;
		System.out.print("금액: ");
		Scanner sc = new Scanner(System.in);
		int cash = sc.nextInt();
		
		int[] change = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		remain = 0;
		for(int i=0; i<change.length; i++) {
			remain = cash / change[i];
			cash -= remain * change[i];
			System.out.println(change[i]+"원: " + remain+"개");
		}
		sc.close();
	}

}
