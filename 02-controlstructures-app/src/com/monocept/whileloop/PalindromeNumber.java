package com.monocept.whileloop;

public class PalindromeNumber {
	public static void main(String[] args) {
		int number = 1221;

		int digit, reverse = 0;
		int temp = number;

		while (temp > 0) {
			digit = temp % 10;
			reverse = reverse * 10 + digit;
			temp /= 10;
		}
		if (reverse == number)
			System.out.println("palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
