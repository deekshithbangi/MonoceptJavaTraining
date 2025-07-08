package com.monocept.model;

public class Private {
	private int number = 1001; // private variable

	public static void main(String args[]) {
		Private obj = new Private();
		int number1 = obj.number;

		System.out.println("Private : Inside the class");
		System.out.println("Number1 : " + number1);
	}
}
