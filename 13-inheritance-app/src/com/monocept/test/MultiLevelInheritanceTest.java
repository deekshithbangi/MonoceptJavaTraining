package com.monocept.test;

import com.monocept.multilevel.model.Child;
import com.monocept.multilevel.model.Parent;

public class MultiLevelInheritanceTest {
	public static void main(String[] args) {

		// Constructor Chaining
		// Child Class is dependent on Parent, Parent depended on GrandParent
		// Constructor Execution first GrandParent -> Parent -> Child
		Child child = new Child();

		child.setName("Ram");
		child.setAge(8);
		System.out.println("Child Name: " + child.getName());
		System.out.println("Child Age: " + child.getAge());

		Parent parent = new Parent();
		parent.setName("Krishna");
		parent.setAge(35);

		System.out.println("Parent Name: " + parent.getName());
		System.out.println("Parent Age: " + parent.getAge());
	}
}
