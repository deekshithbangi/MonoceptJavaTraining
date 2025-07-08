package com.monocept.model;

public class Default {
	int number = 10; // Default Variable

	public static void main(String[] args) {
		Default obj = new Default();

		int number1 = obj.number;
		System.out.println("Default Class: Inside Class");
		System.out.println("Number: " + number1);
	}
}
