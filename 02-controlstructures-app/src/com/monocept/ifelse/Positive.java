package com.monocept.ifelse;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int number = sc.nextInt();

		if (number > 0)
			System.out.println("positive");
		else
			System.out.println("negetive");

		sc.close();
	}
}
