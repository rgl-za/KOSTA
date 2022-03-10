package com.javaex.problem01;

public class MemberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member m = new Member("20172829", "지현정", 20172829);
		m.Draw();
		
		
//		m.toString(); XXXX
		// toString은 문자열만 반환하므로 System.out.println(변수명.toString())
		System.out.println(m.toString());

	}

}
