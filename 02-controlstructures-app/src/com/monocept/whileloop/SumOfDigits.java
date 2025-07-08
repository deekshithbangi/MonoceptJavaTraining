package com.monocept.whileloop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number ");
		int num = sc.nextInt();
		int sum = 0;
		int digit;
		while (num > 0) {
			digit = num % 10;
			sum += digit;
			num /= 10;
		}
		System.out.println("Sum of digits : " + sum);
	}
}
