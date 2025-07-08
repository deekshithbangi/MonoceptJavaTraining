package com.monocept.scanner;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First Number ");
		int number1 = scanner.nextInt();

		System.out.println("Enter Second Number ");
		int number2 = scanner.nextInt();

		int sum = number1 + number2;
		System.out.println("Addition of two numbers = " + sum);
		
		scanner.close();
	}
}
