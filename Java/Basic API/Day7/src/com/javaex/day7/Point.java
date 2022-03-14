package com.javaex.day7;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// equals로 들어온 객체는 다운캐스팅
	public boolean equals(Object obj) {
		Point p = ((Point)obj);
		if(this.hashCode() == p.hashCode()) {
			return true;
		}else if(this.x == p.x && this.y == p.y) {
			return true;
		}else {
			return false;
		}
	}

}
