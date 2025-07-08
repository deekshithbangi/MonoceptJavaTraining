package com.monocept.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
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

		if (m == p) {
			int[][] matrixC = new int[n][q];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < q; j++) {
					for (int k = 0; k < m; k++) {
						matrixC[i][j] = matrixA[i][k] * matrixB[k][j];
					}
				}
			}
			System.out.println(Arrays.deepToString(matrixC));
		} else {
			System.out.println("Matix rows and columns did not match, so multiplication is not possible");
		}

	}
}
