package com.javaex.day5;

public class Person {
	   private String name;
	   private int age;

	   public Person() {
	      // TODO Auto-generated constructor stub
	   }

	   public Person(String name, int age) {
	      this.name = name;
	      this.age = age;
	      System.out.println("생성자 호출 -> Person(String name, int age)");
	   }

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public int getAge() {
	      return age;
	   }

	   public void setAge(int age) {
	      this.age = age;
	   }

	   public void showInfo() {
	      System.out.println("이름: " + name + "\n나이: " + age);
	   }
	}
