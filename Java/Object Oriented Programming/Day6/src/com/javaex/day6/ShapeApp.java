package com.javaex.day6;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.setWidth(3.0);
		r.setHeight(4.0);
		System.out.println("사각형의 넓이는: " + r.area());
		
		Triangle t = new Triangle(3.0, 4.0);
		System.out.println("삼각형의 넓이는: " + t.area());
		
		Circle c = new Circle(5.0);
		System.out.println("원의 넓이는: " + c.area());
		
		Shape c1 = new Circle(3.0);
		
		System.out.println(c1 instanceof Circle);
		
		
	}

}