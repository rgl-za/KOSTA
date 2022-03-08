package com.javaex.day4;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		b1.setTitle("삼국지");
		b1.setName("이문열");
		b1.showInfo();
		
		Book b2 = new Book();
		b2.setTitle("토지");
		b2.setName("박경리");
		b2.showInfo();
	}
}
