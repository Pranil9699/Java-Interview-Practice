package com.slip.no1;

public class Student {

	private int rollNo;
	private String name,course;
	private int age;
	public Student(int rollNo, String name, int age, String course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
}
