package com.monocept.debug;

public class AverageCalculator {

	public static void main(String[] args) {

		int number1 = 10;
		int number2 = 27;

		int sum = addition(number1, number2);

		double average = averageCalculation(sum);

		System.out.println("Average = " + average);
	}

	private static int addition(int number1, int number2) {
		System.out.println("Inside addition method");
		return number1 + number2;
	}

	private static double averageCalculation(int sum) {
		System.out.println("Inside averageCalculation method!!");
		return sum / 2;
	}
}
