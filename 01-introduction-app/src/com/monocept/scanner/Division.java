package com.monocept.scanner;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number ");
		int number1 = scanner.nextInt();

		System.out.println("Enter second number ");
		int number2 = scanner.nextInt();

		int division = number1 / number2;
		System.out.println("Division of two numbers = " + division);

		scanner.close();
	}
}
