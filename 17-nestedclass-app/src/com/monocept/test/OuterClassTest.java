package com.monocept.test;

import com.monocept.model.OuterClass;

public class OuterClassTest {
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass(); // Regular object Creation
		outerClass.displayOuter();

		OuterClass.InnerClass innerClass = outerClass.new InnerClass(); // Using Object of OuterClass to create Object
																		// of InnerClass
		innerClass.displayInner();
	}
}
