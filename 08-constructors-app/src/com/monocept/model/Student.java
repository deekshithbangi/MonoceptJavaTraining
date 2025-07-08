package com.monocept.model;

public class Student {

	private int rollNumber;
	private String name;
	private int age;

//	Constructors 
	public Student() {
		this.rollNumber = 1001;
		this.name = "";
		this.age = 0;
	}

	public Student(int rollNumber, String name, int age) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}

//	Getters
	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

// Setters
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Display Student Details
	public void displayStudentDetails() {
		System.out.println("Student Roll Number: " + this.rollNumber);
		System.out.println("Student Name: " + this.name);
		System.out.println("Student Age: " + this.age);
	}
}
