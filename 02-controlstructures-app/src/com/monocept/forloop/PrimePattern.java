package com.monocept.forloop;

public class PrimePattern {
	public static void main(String[] args) {
		int number = 73;
		int cur = 0, prev = 0;
		for (int i = 2; i <= number; i++) {
			boolean isPrime = true;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				if (prev + 1 == cur) {
					System.out.println();
					prev = cur;
					cur = 0;
				}
				System.out.print(i + " ");
				cur++;
			}
		}

	}
}
