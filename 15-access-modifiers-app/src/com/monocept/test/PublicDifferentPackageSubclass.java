package com.monocept.test;

import com.monocept.model.Public;

public class PublicDifferentPackageSubclass extends Public { // extending Public Class
//	public int number = 15; 		Overrides the number variable of Public Class

	public static void main(String args[]) {
		PublicDifferentPackageSubclass obj = new PublicDifferentPackageSubclass();
		int number1 = obj.number;

		System.out.println("Public : Inside Different Package but sub class");
		System.out.println("Number1 : " + number1);
	}
}
