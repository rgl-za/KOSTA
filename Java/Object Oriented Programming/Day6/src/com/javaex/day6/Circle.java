package com.javaex.day6;

public class Circle extends Shape implements Point{
	private double r;
	
	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.r * this.r * 3.14;
	}
	
	
	public void draw() {
		
	}
	

}