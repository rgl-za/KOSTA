package com.javaex.problem02;

public class Base {

//	private String day;
//	
//	public Base() {
//		
//	}
//	
//	public String getDay() {
//		return day;
//	}
//	public void setDay(String day) {
//		this.day = day;
//	}
//	
//	public Base(String day) {
//		super();
//		this.day = day;
//	}
//	
//	public void Info() {
//		System.out.println(day);
//	}
	
	
	
	public void service(String state) {
//		System.out.println(state);
		
		if(state.equals("낮"))
			day();
		else if(state.equals("오후"))
			afternoon();
		else
			night();
	}
	
	public void day() {
		System.out.println("낮에도 일해");
	}
	
	public void night() {
		System.out.println("밤에도 일해");
	}
	
	public void afternoon() {
		System.out.println("오후에도 일해");
	}
	
}
