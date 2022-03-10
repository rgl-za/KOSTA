package com.javaex.day5;

public class ColorPoint extends Point{

	private String color;
	
	// getter setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 매개변수 1개인 생성자
	public ColorPoint(String color) {
		super();
		this.color = color;
	}
	
	// 매개변수 3개인 생성자
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	public void showInfo() {
		System.out.println(color);
		// getX = this.x
	}
}
