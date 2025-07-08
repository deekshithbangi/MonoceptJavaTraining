package com.monocept.forloop;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			// stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// spaces
			for (int k = 1; k <= (n - i) * 2; k++) { // ( n - (i + 1) ) * 2; (n - i) * 2
				System.out.print(" ");
			}

			// stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
