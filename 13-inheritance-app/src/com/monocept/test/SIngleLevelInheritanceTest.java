package com.monocept.test;

import com.monocept.single.model.Dog;

public class SIngleLevelInheritanceTest {
	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.setName("Husky"); // dog class doesn't have this setName(), it is inherited from Animal Class
		dog.setAge(8);
		dog.eat();
		dog.sayHello();

	}
}
