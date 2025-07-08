package com.monocept.whileloop;

public class ReverseOfNumber {
	public static void main(String[] args) {
		int number = 18952;

		int digit, reverse = 0;
		int originalCopy = number;

		while (number > 0) {
			digit = number % 10;
			reverse = reverse * 10 + digit;
			number /= 10;
		}
		System.out.println(reverse);
	}
}
