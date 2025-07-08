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
		stuA.setRollNumber(sc.nextInt());

		System.out.println("Enter Name: ");
		stuA.setName(sc.next());

		System.out.println("Enter Age: ");
		stuA.setAge(sc.nextInt());

//		Display Student 1
		System.out.println("Student 1 Details: ");
		System.out.println("Roll Number: " + stuA.getRollNumber());
		System.out.println("Name: " + stuA.getName());
		System.out.println("Age: " + +stuA.getAge());
		System.out.println();

//		Student 2
		System.out.println("Enter Student 2 Details: ");
		Student stuB = new Student();

		System.out.println("Enter Roll Number: ");
		stuB.setRollNumber(sc.nextInt());

		System.out.println("Enter Name: ");
		stuB.setName(sc.next());

		System.out.println("Enter Age: ");
		stuB.setAge(sc.nextInt());

//		Display Student 2 
		System.out.println("Student 2 Details: ");
		System.out.println("Roll Number: " + stuB.getRollNumber());
		System.out.println("Name: " + stuB.getName());
		System.out.println("Age: " + +stuB.getAge());

		sc.close();
	}
}
