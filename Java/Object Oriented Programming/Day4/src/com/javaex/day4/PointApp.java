package com.javaex.day4;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Point p1 = new Point();
//		p1.setX(5);
//		p1.setY(5);
//		p1.draw();
//		
//		Point p2 = new Point();
//		p2.setX(10);
//		p2.setY(23);
//		p2.draw();
		
		Point p1 = new Point(5,5);
		p1.draw();
		
		Point p2 = new Point(10,23);
		p2.draw();
		
		p1.draw(true);
		p2.draw(false);

	}

}
