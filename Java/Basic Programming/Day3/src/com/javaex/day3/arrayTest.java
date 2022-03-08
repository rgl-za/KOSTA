package com.javaex.day3;

public class arrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = new int[3];
		
		intArray[0]= 3;
		intArray[1]= 6;
		intArray[2]= 9;
		
		for(int i=0; i<3; i++) {
			System.out.println(intArray[i]);
		}
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

}
