package com.monocept.scanner;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number ");
		int number1 = scanner.nextInt();

		System.out.println("Enter second number ");
		int number2 = scanner.nextInt();

		int muliplication = number1 * number2;
		System.out.println("Subtraction of two numbers = " + muliplication);

		scanner.close();
	}
}
