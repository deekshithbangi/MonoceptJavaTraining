package com.monocept.tokens;

public class SwappingWithThirdVariable {

	public static void main(String[] args) {

		int number1 = 10;
		int number2 = 20;

		System.out.println("Before Swapping : ");
		System.out.println(number1 + ", " + number2);

		int temp = number1;
		number1 = number2;
		number2 = temp;

		System.out.println("After Swapping : ");
		System.out.println(number1 + ", " + number2);
	}
}
