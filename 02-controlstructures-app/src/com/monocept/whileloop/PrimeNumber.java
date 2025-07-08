package com.monocept.whileloop;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number : ");
		int number = sc.nextInt();

		boolean isPrime = true;
		int i = 2;
		while (i * i <= number) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
			i++;
		}
		if (isPrime)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
		
		sc.close();
	}
}

// A prime number is a number that can only be divided by itself and 1 without remainders.