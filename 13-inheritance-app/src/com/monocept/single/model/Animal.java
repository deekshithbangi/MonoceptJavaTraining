package com.monocept.single.model;

/**
 * Parent Class or Super Class Animal is Generalized Term
 */
public class Animal {

	private String name;
	private int age;

//	Getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

//	Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	Methods 
	public void eat() {
		System.out.println("This Animal eats food!");
	}

	public void sayHello() {
		System.out.println("Animal Hello");
	}

}
