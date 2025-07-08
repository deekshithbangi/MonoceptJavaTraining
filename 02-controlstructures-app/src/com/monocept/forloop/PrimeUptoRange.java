package com.monocept.forloop;

public class PrimeUptoRange {
	public static void main(String[] args) {
		int number = 50;

		for (int i = 2; i <= number; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}

	}

	private static boolean isPrime(int num) {
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
