package com.javaex.day6;

public class Rectangle extends Shape implements Point{
	private double width;
	private double height;
	
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

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.width * this.height;
	}
	
	public void draw() {
		
	}

}