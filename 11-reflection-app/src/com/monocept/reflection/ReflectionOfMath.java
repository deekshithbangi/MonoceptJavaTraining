package com.monocept.reflection;

import java.lang.reflect.Method;

public class ReflectionOfMath {
	public static void main(String[] args) {
		try {

			Class mathClass = Class.forName("java.lang.Math");

			System.out.println(mathClass.getName());
			System.out.println(mathClass.getSimpleName());
			System.out.println(mathClass.hashCode());
			System.out.println(mathClass.isArray());
			System.out.println(mathClass.getMethods());

			Method methods[] = mathClass.getMethods();

			for (Method method : methods) {
				System.out.print(method.getName());
				System.out.println("\t " + method.getModifiers());
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
