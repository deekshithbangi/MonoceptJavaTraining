package com.monocept.test;

import com.monocept.hierarchical.model.Cat;
import com.monocept.hierarchical.model.Dog;

public class HierarchicalInheritanceTest {
	public static void main(String[] args) {

		Dog dog = new Dog(); // Inherits Animal Class
		Cat cat = new Cat(); // Inherits Animal Class

		dog.setName("Jimmy");
		cat.setName("Crison");

		System.out.println("Dog Name: " + dog.getName());
		System.out.println("Cat Name: " + cat.getName());
	}
}
