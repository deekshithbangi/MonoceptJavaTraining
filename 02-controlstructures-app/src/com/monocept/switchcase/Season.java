package com.monocept.switchcase;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Season number ");
		int season = sc.nextInt();

		switch (season) {
		case 12:
		case 1:
		case 2:
			System.out.println("Winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Summer");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Monsoon");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Post-Monsoon");

		default:
			System.out.println("Invalid season number");

		}
		sc.close();
	}
}
