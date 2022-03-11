package com.javaex.day6;

public class Triangle extends Shape{
	private double width;
	private double height;

	public Triangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (this.width * this.height) / 2.0;
	}
	
	public void draw() {
		
	}

}
