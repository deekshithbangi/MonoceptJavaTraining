package com.monocept.model;

public class Point {

	private int x;
	private int y;

//	Default Constructors 
	public Point() {
		x = 1;
		y = 1;
	}

//	Parameterised Constructor 
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

//	Copy Constructor 
	public Point(Point point) {
		x = point.getX();
		y = point.getY();
	}

//	Getters 
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

//	Setters 
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
}
