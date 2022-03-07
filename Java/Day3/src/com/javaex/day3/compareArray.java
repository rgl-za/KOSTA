package com.javaex.day3;

public class compareArray {

	public static void main(String[] args) {
		// new int 생략 가능
		int[] leftArray = new int[]{10,20,30};
		int[] rightArray = new int[]{10,10,30};
		
		if(leftArray.length != rightArray.length) {
			System.out.println("두 배열의 크기가 다릅니다.");
		}
		
		for(int i=0; i<leftArray.length; i++) {
			if(leftArray[i] != rightArray[i]) {
				System.out.println(i+ "번째 값이 다릅니다.");
			}
		}
	}
	
}


