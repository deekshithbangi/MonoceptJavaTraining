package com.monocept.reflection;

public class Cat {

	private final String name;
	public int age;

//	Constructor 
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	Getters
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

//	Setters
	public void setAge(int age) {
		this.age = age;
	}

//	Methods 
	public void meow() {
		System.out.println("meow");
	}

	private void heyThisIsPrivate() {
		System.out.println("Hello did you call this?");
	}

	public static void thisIsPublicStaticMethod() {
		System.out.println("I'm public and static");
	}

	private static void thisIsPrivateStaticMethod() {
		System.out.println("Hey, I'm private and static");
	}
}
