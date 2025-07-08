package com.monocept.model;

public class Rectangle implements Shape {

	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		System.out.println("Rectangle Area: " + length * breadth);
	}

	@Override
	public void perimeter() {
		System.out.println("Rectangle Perimeter: " + (2 * length * breadth));
	}
}
