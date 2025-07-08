package com.monocept.whileloop;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int number = sc.nextInt();

		int i = 1, sum = 0;
		while (i <= number / 2) {
			if (number % i == 0) {
				sum += i;
			}
			i++;
		}

		if (sum == number)
			System.out.println("Perfect Number");
		else
			System.out.println("Not Perfect Number");
		
		sc.close();
	}
}
// A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.
// For instance, 6 has proper divisors 1, 2 and 3, and 1 + 2 + 3 = 6, 