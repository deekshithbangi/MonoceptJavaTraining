package com.monocept.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValueInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number of Elements in Array : ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int maxElement = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1])
				maxElement = arr[i + 1];
		}
		System.out.println("Max Element : " + maxElement);
		System.out.println(Arrays.toString(arr));
	}
}
