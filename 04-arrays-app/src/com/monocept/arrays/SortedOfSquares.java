package com.monocept.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedOfSquares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Elements in Array : ");
		int n = sc.nextInt();

		System.out.print("Enter Array Elements : ");

		// array=[-3,-2,-1,0,1]
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			arr[i] = arr[i] * arr[i]; // storing the squared input values
		}

		int left = 0;
		int right = arr.length - 1;
		int i = arr.length - 1;
		int[] sortedArray = new int[arr.length];
		// sortedArray = [0, 0, 0, 0, 0]

		while (left <= right) {
			if (arr[left] > arr[right]) {
				sortedArray[i] = arr[left];
				left++;
			} else {
				sortedArray[i] = arr[right];
				right--;
			}
			i--;
		} // sorting the largest value in sortedArray from the right to left
		System.out.println("Sorted Array = " + Arrays.toString(sortedArray));
	}
}
//  rule always give increasing order elements in array
//[1,2,3,4,5]  =>  [1,4,9,16,25]
//[-5,-4,-3,-2,-1]  =>  [1,4,9,16,25]
//[-5,-3,1,2,4]  => [1,4,9,16,25]