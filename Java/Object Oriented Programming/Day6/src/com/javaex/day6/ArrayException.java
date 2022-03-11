package com.javaex.day6;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[] {3,6,9};
		try {
			System.out.println(intArray[3]);
			
		} catch(Exception e) {
			System.out.println("실행 중 에러 발생!!!!!\n"+e.getMessage());
		}
		

	}

}
