package com.monocept.whileloop;

import java.util.Scanner;

public class TableOfNNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number ");
//		int table = sc.nextInt(); 

		int N = sc.nextInt();
		int i = 1;
		while (i <= 10) {
			int j = 1;
			while (j <= N) {
				System.out.print(i * j + "\t");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
// re-do in TableNumbersPattern