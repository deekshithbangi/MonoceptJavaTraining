package com.monocept.arrays;

import java.util.Scanner;

public class SecondMaximumElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number of Elements in Array : ");
		int n = sc.nextInt();

		System.out.print("Enter Array Elements : ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int largestNumber = Integer.MIN_VALUE;
		int secondLargestNumber = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largestNumber) {
				secondLargestNumber = largestNumber;
				largestNumber = arr[i];
			} else if (arr[i] > secondLargestNumber && arr[i] != largestNumber) {
				secondLargestNumber = arr[i];
			}
		}
		System.out.println("Largest Number = " + largestNumber);
		System.out.println("Second Largest Number = " + secondLargestNumber);

	}
}
