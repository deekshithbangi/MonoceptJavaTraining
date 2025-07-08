package com.monocept.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTutorial {
	public static void main(String[] args) throws Exception {

		Cat myCat = new Cat("Stella", 9);

		Field[] myFields = myCat.getClass().getDeclaredFields();

//		Access -> public, protected, default (package) access, and private fields
		for (Field field : myFields) {
			System.out.println(field.getName());
		}

//		Name variable in cat is private and final, we can't change it! and there is not setter for name. 
//		But with reflection we can change it. 

		for (Field field : myFields) {
			if (field.getName().equals("name")) {
				field.setAccessible(true);
				field.set(myCat, "Jimmy");
			}
		}
		System.out.println(myCat.getName());

//		Methods
		Method[] catMethods = myCat.getClass().getDeclaredMethods();

		for (Method method : catMethods) {
			System.out.println(method.getName());
		}

//		Accessing private, private static methods outside of class, using reflection

		for (Method method : catMethods) {
			// Public Method
			if (method.getName().equals("meow")) {
				method.invoke(myCat);
//				myCat.meow();								// It is public so, we can directly call the method
			}

			// Private Method
			if (method.getName().equals("heyThisIsPrivate")) {
				method.setAccessible(true); // this will help us to access the private method.
				method.invoke(myCat);
			}

			// Private Static Method
			if (method.getName().equals("thisIsPrivateStaticMethod")) {
				method.setAccessible(true);
				method.invoke(null); // passing `null` because we call calling static method
			}
		}
	}
}
