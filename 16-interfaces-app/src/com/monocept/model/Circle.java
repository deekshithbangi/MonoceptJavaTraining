package com.monocept.model;

public class Circle implements Shape {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("Area of Circle: " + radius * radius);
	}

	@Override
	public void perimeter() {
		System.out.println("Rectangle Perimeter: " + (3.14 * radius * radius));
	}
}
