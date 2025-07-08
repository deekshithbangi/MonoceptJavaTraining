package com.monocept.typecasting;

public class WrapperTest {
	public static void main(String[] args) {

		int number = 10;
		Integer numberInt = number; // auto-boxing
		int n = numberInt; // unboxing

		numberInt.byteValue();
		System.out.println(numberInt.byteValue());

	}
}
// Autoboxing -> Representing a normal data type value as an object