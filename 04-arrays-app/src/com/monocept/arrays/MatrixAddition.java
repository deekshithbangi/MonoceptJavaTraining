package com.monocept.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter No.of Rows and Columns in 1st Matrix : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] matrixA = new int[n][m];

		System.out.println("Enter 1st Matrix Elements : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrixA[i][j] = sc.nextInt();
			}
		}

		System.out.print("Enter No.of Rows and Columns in 2nd Matrix : ");
		int p = sc.nextInt();
		int q = sc.nextInt();
		int[][] matrixB = new int[p][q];

		System.out.println("Enter 2nd Matrix Elements : ");
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < q; j++) {
				matrixB[i][j] = sc.nextInt();
			}
		}
		int[][] additionMatrix = new int[n][m];
		if (n == p && m == q) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					additionMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
				}
			}
		}
		System.out.println(Arrays.deepToString(additionMatrix));
	}
}
