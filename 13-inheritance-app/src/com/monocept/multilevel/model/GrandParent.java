package com.monocept.multilevel.model;

public class GrandParent {

	private String name;
	private int age;

//	Constructor 
	public GrandParent() {
		System.out.println("GrandParent Constructor Called!!");
	}

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
//	public void setName(String name) {
////		name = name1;
//		name = name;
//	}

	public void setAge(int age) {
		this.age = age;
	}
}
