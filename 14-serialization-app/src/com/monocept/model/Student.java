package com.monocept.model;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L; // to check and verify with which version we are de-serializing.s
	private int rollNumber;
	private String name;
	private int age;

	public Student(int rollNumber, String name, int age) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}

//	Getters 
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
