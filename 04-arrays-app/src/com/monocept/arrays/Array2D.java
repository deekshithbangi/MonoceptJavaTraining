package com.monocept.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter No.of Rows and Columns in 2D Array : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr2D = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr2D[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr2D.length; i++) {
			for (int j = 0; j < arr2D[0].length; j++) {
				System.out.print(arr2D[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println(Arrays.deepToString(arr2D));
//		for(int[] row : arr2D) {
//			for(int column : row) {
//				System.out.print(column + " ");
//			}
//			System.out.println();
//		}
	}
}
