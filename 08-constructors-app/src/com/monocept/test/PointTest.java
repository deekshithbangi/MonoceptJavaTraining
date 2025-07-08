package com.monocept.test;

import com.monocept.model.Point;

public class PointTest {
	public static void main(String[] args) {

		Point pointA = new Point();
		diplayPoint(pointA);

		pointA.setX(10);
		pointA.setY(20);
		diplayPoint(pointA);

		Point pointB = new Point(pointA); // just copy's pointA x and y values and creates a new memory location
		diplayPoint(pointB);

		System.out.println(pointA.hashCode());
		System.out.println(pointB.hashCode());

		Point pointC = new Point(pointB);
		diplayPoint(pointC);

		Point pointD = new Point();
		pointD = pointC; // pointD will also refer to pointC 's memory location
		diplayPoint(pointD);

		System.out.println(pointC.hashCode());
		System.out.println(pointD.hashCode());

	}

	private static void diplayPoint(Point point) {
		System.out.println("(" + point.getX() + ", " + point.getY() + ")");
	}
}
