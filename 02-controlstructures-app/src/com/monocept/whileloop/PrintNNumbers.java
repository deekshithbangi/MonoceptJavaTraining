package com.monocept.whileloop;

import java.util.Scanner;

public class PrintNNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int number = sc.nextInt();
		int i = 1;
		while (i <= number) {
			System.out.print(i + ", ");
			i++;
		}
	}
}
