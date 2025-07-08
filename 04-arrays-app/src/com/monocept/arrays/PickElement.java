package com.monocept.arrays;

import java.util.Scanner;

public class PickElement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Elements in Array : ");
		int n = sc.nextInt();

		System.out.print("Enter Array Elements : ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		if (n == 1) {
			System.out.println(arr[0] + ", ");
			System.exit(0);
		} else if (arr[0] > arr[1]) {
			System.out.print(arr[0] + ", ");
		}

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				System.out.print(arr[i] + ", ");
			}
		}

		// check - for last element
		if (arr[n - 1] > arr[n - 2]) {
			System.out.print(arr[n - 1]);
		}
	}
}
// An Element is a peakElement if it is greater than it's neighbouring elements
/*
 * input -1 n = 4 5 12 1 20
 * 
 * input -2 -> n = 8 10 5 20 15 2 23 90 67
 */