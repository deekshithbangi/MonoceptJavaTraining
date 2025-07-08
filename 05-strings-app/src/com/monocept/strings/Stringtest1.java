package com.monocept.strings;

public class Stringtest1 {
	public static void main(String[] args) {
//		StringBuffer middlename = new StringBuffer("MVLAjay");
		StringBuffer m = new StringBuffer();
		StringBuilder lastname = new StringBuilder("kumar");
		String firstname = new String("R");

//		concat1(middlename);
//		System.out.println(middlename);
		concat2(firstname);
		System.out.println(firstname);
		concat3(lastname);
		System.out.println(lastname);
	}

	private static void concat2(String firstname) {
		firstname = firstname + "MVLAjay Kumar";
	}

	private static void concat3(StringBuilder lastname) {
		lastname = lastname.append("RMVLAjay");
	}

//	private static void concat1(StringBuffer middlename) {
//		middlename = middlename.append("R  kumar");
//	}
}