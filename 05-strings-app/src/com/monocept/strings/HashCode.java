package com.monocept.strings;

public class HashCode {
	public static void main(String[] args) {

		String string1 = "ABCD";
		String string2 = "ABCD";
		String string3 = new String("ABCD");

		System.out.println(string1);
		System.out.println(string1.hashCode());

		System.out.println(string2);
		System.out.println(string2.hashCode());

		System.out.println(string1 == string3); // strings are not interned

		string2 = string2 + "EFG"; // string2 will point to newly created object.
		System.out.println(string2);
		System.out.println(string2.hashCode());

	}
}
// both string1 and string2 point to same memory location i.e strings are interned 
// the original string "ABCD!" is not modified. 
// Instead, a new String object with the value "ABCDEFG" is created, and the reference original is updated to point to this new object.
