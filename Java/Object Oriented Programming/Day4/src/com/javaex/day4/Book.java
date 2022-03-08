package com.javaex.day4;

public class Book {
	
	private String title;
	private String name;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("책["+getTitle()+": "+getName()+"]");
	}
	
}
