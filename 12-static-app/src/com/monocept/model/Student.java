package com.monocept.model;

public class Student {

//	Instance variables - memory is allocated when object is created 
	private int rollNumber;
	private String name;

//	static variables - memory is allocated once at compile time
	public static int count = 0;
	public static String schoolName = "DPS";

	public Student() {
		count++;
	}

//	Getters and Setters
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student.count = count;
	}

	public static String getSchoolName() {
		return schoolName;
	}

	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}

	// Static block - executes once when the class is loaded
	static {
		System.out.println("Static block executed: schoolName initialized");
	}
}
