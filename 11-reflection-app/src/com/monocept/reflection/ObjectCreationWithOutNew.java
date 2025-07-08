package com.monocept.reflection;

public class ObjectCreationWithOutNew {
	public static void main(String[] args) {

		try {

			Class reflectionOfObject = Class.forName("com.monocept.reflection.ReflectionOfObject"); // Returns The Class
																									// object for the
																									// class with the
																									// specified name.

			WithoutNewTestClass object1 = (WithoutNewTestClass) reflectionOfObject.newInstance(); // Creates a new
																									// instance of the
																									// class represented
																									// by this Class
																									// object.
			WithoutNewTestClass object2 = (WithoutNewTestClass) object1;

			System.out.println(object1.evenOrOdd(20));
			System.out.println(object2.evenOrOdd(17));

			System.out.println(object1.hashCode());

			System.out.println(object2.hashCode());

			System.out.println(object1.Addition(3, 4));

			System.out.println(object2.Addition(44, 21));

		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
