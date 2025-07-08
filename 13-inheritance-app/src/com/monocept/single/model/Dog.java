package com.monocept.single.model;

/**
 * Child Class or Sub Class Dog is a Specific Animal
 */
public class Dog extends Animal {

//	The below method overrides the Animal sayHello() Method
//	Method Overriding
	public void sayHello() {
		System.out.println("Woof");
	}
}
