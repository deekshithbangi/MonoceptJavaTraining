package com.monocept.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassLoader {
	public static void main(String[] args) {

		try {

			Class stringClass = Class.forName("java.lang.String");

//			Constructors in a Class
			Constructor[] constructors = stringClass.getConstructors();

			for (Constructor constructor : constructors) {
				System.out.print(constructor);
				System.out.println(" " + constructor.getParameterCount());
			}

//			Methods in a Class 

			Method[] methods = stringClass.getMethods();

			System.out.println("\n Printing Methods:");
			for (Method method : methods) {
				System.out.println(method);
				System.out.print(method.getName() + " ");
				System.out.print(method.getParameterCount());
				System.out.println();
			}

		} catch (ClassNotFoundException e) {
			e.getStackTrace();
		}
	}
}
