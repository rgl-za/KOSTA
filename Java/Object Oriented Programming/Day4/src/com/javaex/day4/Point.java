package com.javaex.day4;

public class Point {
	
	private int x;
	private int y;
	
	
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
	
	public void draw() {
		System.out.println("점[x="+this.x+", y=" + this.y + "]을 그렸습니다.");
		// getX = this.x
	}
	
	
	// 생성자
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void draw(Boolean check) {
		if(true)
			System.out.println("점[x="+this.x+", y=" + this.y + "]을 삭제했습니다..");
	}
	
}
