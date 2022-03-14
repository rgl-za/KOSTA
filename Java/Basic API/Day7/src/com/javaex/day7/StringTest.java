package com.javaex.day7;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String greet = "Hello";
		String name = "JAVA";
		
		System.out.println(greet+name+"!");
		System.out.println(greet+" "+name+"!");
		
		String greeting = "Hello JAVA!";
		System.out.println(greeting.charAt(0));
		System.out.println(greeting.charAt(10));
		System.out.println(greeting.substring(0,5));
		
		for(int i=0; i<greeting.length(); i++) {
			System.out.println(greeting.charAt(i));
		}

	}

}
