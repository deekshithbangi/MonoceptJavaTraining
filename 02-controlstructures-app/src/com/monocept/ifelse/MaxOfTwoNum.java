package com.monocept.ifelse;

import java.util.Scanner;

public class MaxOfTwoNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number1: ");
		int number1 = sc.nextInt();

		System.out.println("Enter a Number2: ");
		int number2 = sc.nextInt();

		if (number1 > number2)
			System.out.println("Number1 is greater");
		else if (number1 < number2)
			System.out.println("Number2 is greater");
		else
			System.out.println("Both are Equal");

		sc.close();
	}
}
