package com.javaex.day5;

public class Student extends Person {
	   private String scholName;
	   
	   public Student() {
	      // TODO Auto-generated constructor stub
	   }
	   
	   public Student(String scholName) {
	      super();
	      this.scholName = scholName;
	      System.out.println("생성자 호출 -> Student(String scholName)");
	   }
	   
	   public Student (String name, int age) {
	      super(name, age);
	   }

	   public Student (String name, int age, String scholName) {
	      super(name, age);
	      this.scholName = scholName;
	      System.out.println("생성자 호출 -> Student(String name, int age, String scholName)");
	   }

	   public String getScholName() {
	      return scholName;
	   }

	   public void setScholName(String scholName) {
	      this.scholName = scholName;
	   }
	   
	   public void showInfo() {
	      super.showInfo();
	      System.out.println("학교: "+ scholName );
	   }
	   
	}
