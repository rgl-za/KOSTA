package com.javaex.problem02;

public class Depart extends Employee{
	
//	private String name;
//	private int salary;
	private String department;
	
	public Depart(String name, int salary, String department) {
		// TODO Auto-generated constructor stub
		super(name,salary);
		this.department = department;
	}

	// 상속 받고 메소드 getInformation 오버라이딩
	 public void getInformation() {
		 	super.getInformation();
	        System.out.print(" 부서: " + department);
	    }
	
}
