package com.monocept.model;

public class Rectangle extends Shape {

	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void area() {
		System.out.println("Rectangle Area: " + length * breadth);
	}
}
