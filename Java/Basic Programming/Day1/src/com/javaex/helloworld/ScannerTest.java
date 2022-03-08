package com.javaex.helloworld;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(num);
		
		sc.close(); // 선택사항이지만(가비지 컬렉터) 뭔가 자원을 썼으면 자원을 해제하는 습관을 가지는게 좋음
	}

}
