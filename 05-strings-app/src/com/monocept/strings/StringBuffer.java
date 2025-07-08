package com.monocept.strings;

public class StringBuffer {
	public static void main(String[] args) {
		String firstName = new String("Deek");
//		StringBuffer middleName = new StringBuffer("Techlabs");
		StringBuilder lastName = new StringBuilder("Bangi");

		concat1(firstName);
		System.out.println("From main firstName = " + firstName);

//		System.out.println(middleName.hashCode());
//		concat2(middleName);
//		System.out.println("From main middleName = " + middleName);
//		System.out.println(middleName.hashCode());

		System.out.println(lastName.hashCode());
		concat3(lastName);
		System.out.println("From main lastName = " + lastName);
		System.out.println(lastName.hashCode());

	}

	private static void concat1(String firstName) {
		firstName = firstName + "shith";
	}

//	private static void concat2(StringBuffer middleName) {
//		middleName = middleName.append("Training");
//	}

	private static void concat3(StringBuilder lastName) {
		lastName = lastName.append("Deekshith");
	}

}
//1. String  ->  immutable   -> can not change contents
//2. StringBuffer  -> mutable  ->  can be modified   -> Thread safe
//3. StringBuilder  ->  mutable  ->  can be modified   -> not thread safe

//String -> create a new memory location, where as 
//In StringBuffer and StringBuilder ->  the changes are made in same memory location. so there hashCode are same. 
