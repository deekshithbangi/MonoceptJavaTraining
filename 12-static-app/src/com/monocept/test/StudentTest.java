package com.monocept.test;

import com.monocept.model.Student;

public class StudentTest {
	public static void main(String[] args) {

		System.out.println("No.of Students: " + Student.count); // Accessing count using Class name, instead of obj.
																// because count variable is static
		System.out.println(Student.getCount());

		Student student1 = new Student();
		student1.setRollNumber(1001);
		student1.setName("deekshtih");
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		Student student5 = new Student();

		// All instances of Student, share same school name. Where as instance variables
		// has different values/names for each instance/obj's
		System.out.println(
				"Student 1 School Name: " + student1.schoolName + "\nStudent 2 School Name: " + student2.schoolName);

		System.out.println("No.of Students: " + Student.count);
		System.out.println(Student.getCount()); // getCount() is static method. Can be invoked from a static method.

//		sum(10, 20); 	// can't be accessed, because non static method 

		StudentTest test = new StudentTest();
		System.out.println(test.sum(10, 50));

	}

	public int sum(int a, int b) {
		return a + b;
	}
}
