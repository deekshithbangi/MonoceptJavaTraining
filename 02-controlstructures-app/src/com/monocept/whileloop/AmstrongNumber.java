package com.monocept.whileloop;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int number = sc.nextInt();

		int sum = 0, digit;
		int originalNumber = number;
		int count = String.valueOf(number).length();

		while (number > 0) {
			digit = number % 10;
			sum += Math.pow(digit, count);
			number /= 10;
		}

		if (sum == originalNumber)
			System.out.println("Amstrong");
		else
			System.out.println("Not Amstrong");
		
		sc.close();
	}
}
// The sum of its digits raised to the power of the number of digits equals the number itself.
// 153: 1³ + 5³ + 3³ = 1 + 125 + 27 = 153.
// 153, 370, 371, 9474