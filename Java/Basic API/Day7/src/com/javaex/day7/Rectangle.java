package com.javaex.day7;

public class Rectangle{
	private double width;
	private double height;
	
	public Rectangle(int width, int height) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	public double area() {
		// TODO Auto-generated method stub
		return this.width * this.height;
	}
	
	public boolean equals(Object obj) {
		Rectangle r = ((Rectangle)obj);
		if(this.area() == r.area()) {
			return true;
		}else {
			return false;
		}
	}

}
