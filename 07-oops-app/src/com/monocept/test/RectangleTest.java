package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		Rectangle A
		System.out.println("Enter 1st Rectangle Details: ");
		Rectangle recA = new Rectangle(sc.nextDouble(), sc.nextDouble());
		System.out.println("1st Area: " + recA.getArea());

//		Rectangle B
		System.out.println("Enter 1st Rectangle Details: ");
		Rectangle recB = new Rectangle(sc.nextDouble(), sc.nextDouble());
		System.out.println("2nd Area: " + recB.getArea());

		sc.close();
	}
}