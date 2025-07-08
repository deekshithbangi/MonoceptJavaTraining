package com.monocept.model;

public class Rectangle {

	private double length;
	private double width;

//	Constructor 
	public Rectangle() {
		this.length = 0.0;
		this.width = 0.0;
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

//	Getters 
	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

//	Setters 
	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

//	Display of Area  
	public double getArea() {
		return length * width;
	}
}
