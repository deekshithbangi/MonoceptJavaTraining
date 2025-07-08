package com.monocept.model;

public class Student {
	private int rollNumber;
	private String name;
	private CourseType course;

	public Student(int rollNumber, String name, CourseType course) { // added CourseType, which is a enum
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.course = course;
	}

	public Student() {
		super();
	}

	// Getters
	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public CourseType getCourse() {
		return course;
	}

//	Setters
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(CourseType course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", course=" + course + "]";
	}
}