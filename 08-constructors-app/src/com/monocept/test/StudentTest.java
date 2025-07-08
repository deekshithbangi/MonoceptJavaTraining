package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Student;

public class StudentTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		Student 1
		System.out.println("Enter Student 1 Details: ");
		Student stuA = new Student();

		System.out.println("Enter Roll Number: ");
		int rollNumber = sc.nextInt();
		stuA.setRollNumber(rollNumber);

		System.out.println("Enter Name: ");
		String name = sc.next();
		stuA.setName(name);

		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		stuA.setAge(age);

//		Display Student 1
		stuA.displayStudentDetails();
		System.out.println();

//		Student 2
		System.out.println("Enter Student 2 Details(Roll Number, Name, Age): ");
		Student stuB = new Student(sc.nextInt(), sc.next(), sc.nextInt());

//		Display Student 2 
		stuB.displayStudentDetails();

		sc.close();
	}
}
