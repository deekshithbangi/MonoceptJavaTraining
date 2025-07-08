package com.monocept.model;

public class DefaultSubclass extends Default { // Extending Default Class
	public static void main(String[] args) {
		Default obj = new Default();

		int number = obj.number;

		System.out.println("Default : Inside Same Package and Sub Class");
		System.out.println("Number1 : " + number);
	}
}
