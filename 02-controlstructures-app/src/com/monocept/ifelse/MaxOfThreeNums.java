package com.monocept.ifelse;

import java.util.Scanner;

public class MaxOfThreeNums {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number1: ");
		int number1 = sc.nextInt();

		System.out.println("Enter a Number2: ");
		int number2 = sc.nextInt();

		System.out.println("Enter a Number3: ");
		int number3 = sc.nextInt();

		if (number1 > number2 && number1 > number3)
			System.out.println("Number1 is greater");
		else if (number2 > number1 && number2 > number3)
			System.out.println("Number2 is greater");
		else if (number3 > number1 && number3 > number2)
			System.out.println("Number3 is greater");
		else
			System.out.println("All are equal");
		
		sc.close();
	}
}
