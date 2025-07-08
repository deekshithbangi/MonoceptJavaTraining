package com.monocept.test;

import com.monocept.model.Circle;
import com.monocept.model.Rectangle;

public class ShapeTest {
	public static void main(String[] args) {

		Circle circle = new Circle(2);
		circle.area();

		Rectangle rectangle = new Rectangle(15, 12);
		rectangle.area();
	}
}
