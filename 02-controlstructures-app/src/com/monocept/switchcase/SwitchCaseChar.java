package com.monocept.switchcase;

import java.util.Scanner;

public class SwitchCaseChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a grade(A,B,C,F): ");
		String grade = sc.next();

		switch (grade) {
		case "A" -> System.out.println("Excellent");

		case "B" -> System.out.println("Good");

		case "C" -> System.out.println("Needs Improvements");

		case "F" -> {
			System.out.println("Fail!!");
			System.out.println("Study hard and prepare for supplementary examination!!");
		}

		default -> System.out.println("Invalid grade");
		}
		sc.close();
	}
}
