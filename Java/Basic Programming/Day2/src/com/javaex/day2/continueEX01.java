package com.javaex.day2;

public class continueEX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=20; i++) {
			
			if(i%2!=0 && i%3!=0) {
				System.out.println(i);
			}
			else
				continue;
		}	
	}

}
