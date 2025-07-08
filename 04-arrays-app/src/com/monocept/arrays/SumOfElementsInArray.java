package com.monocept.arrays;

import java.util.Scanner;

public class SumOfElementsInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number of Elements in Array : ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i : arr) {
			sum += i;
		}

		System.out.println("Sum of Elements = " + sum);
	}
}
