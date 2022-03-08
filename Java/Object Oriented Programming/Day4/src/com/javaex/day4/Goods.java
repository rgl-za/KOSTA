package com.javaex.day4;

public class Goods {
	private String name;
	private int price;
	
	public void setName(String name) { // 저장
		this.name = name;
	}
	
	public String getName(){ // 읽음
		return name; // return this.name
	}
	
	
	public void setPrice(int price) { // 저장
		this.price = price;
	}
	
	public int getPrice(){ // 읽음
		return price; // return this.name
	}
	
	// 출력
	public void showInfo() {
		System.out.println("상품명: "+this.name);
		System.out.println("가격: "+this.price);
		System.out.println("");
	}
	
	// 초기화1
	public Goods() {
		this("품절", 0);
	}
	
	// 초기화2
	public Goods(String name, int price) {
		// 타입 맞춰서 작성
		this.name= name;
		this.price= price;
	}
	
	// 매개변수가 다르다 = 시그니처가 다름..... 타입만 봄....
	// 시그니처가 같은 타입의 메소드는 오버로딩을 할 수 없음
	
	
	
}

