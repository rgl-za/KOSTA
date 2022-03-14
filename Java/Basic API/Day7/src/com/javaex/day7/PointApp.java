package com.javaex.day7;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point a = new Point(2,3);
		Point b = new Point(10,5);
		Point c = new Point(2,3);
		Point d = a;
		
		System.out.println(a.hashCode());
		System.out.println(a.getClass());
		System.out.println(a.getClass().getName());
		System.out.println(a.toString());
//		System.out.println(a);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
