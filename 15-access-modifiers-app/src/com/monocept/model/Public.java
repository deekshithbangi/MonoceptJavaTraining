package com.monocept.model;

public class Public {
	public int number = 10; // Public variable

	public static void main(String args[]) {
		Public obj = new Public();
		int number1 = obj.number;

		System.out.println("Public : Inside same class");
		System.out.println("Number1 : " + number1);
	}
}
