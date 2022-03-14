package com.javaex.day7;

public class StringPratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "JAVA Programming";
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println("");
		
		System.out.println(str.length());
		
		
		
//		for(int i=0; i<20; i++) {
//			System.out.print(str.charAt(i));
//		}
//		System.out.println("");
//		
//		System.out.println("배열의 길이 변경");5
		
		
		
		String s="";
		
		String str2 = "apple mango banana";
		s=str2.replace(" ", ",");
		
		System.out.println(s);

	}

}
