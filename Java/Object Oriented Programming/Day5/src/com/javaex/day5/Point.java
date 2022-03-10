package com.javaex.day5;

public class Point {
	
	private int x;
	private int y;
	
	// 기본 생성자: 매개변수가 있는 생성자를 작성할때는 기본생성자는 필수로 작성 
	public Point() {
	
	}
	
	// getter setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// 매개변수가 2개인 생성자
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public void showInfo() {
		System.out.println("점[x="+this.x+", y=" + this.y + "]을 그렸습니다.");
		// getX = this.x
	}

}
