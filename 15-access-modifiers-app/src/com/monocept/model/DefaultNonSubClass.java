package com.monocept.model;

public class DefaultNonSubClass { // Not Exteding Default Class
	public static void main(String[] args) {

		Default obj = new Default();

		int number = obj.number;

		System.out.println("Same Package: Out side of the class");
		System.out.println(number);
	}
}
