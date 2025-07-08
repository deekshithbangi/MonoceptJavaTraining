package com.monocept.whileloop;

public class PrintEvenNumbersUptoRange {
	public static void main(String[] args) {
		int number = 50;

		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}
}
