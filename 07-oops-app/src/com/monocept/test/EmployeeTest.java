package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		Details of Employee 1
		System.out.println("Enter 1st Employee Details(id, name, salary): ");
		Employee emp1 = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());

		System.out.println("Details of Employee 1: ");
		emp1.displayEmployeeDetails();

//		Details of Employee 2
		System.out.println("Enter 2nd Employee Details(id, name, salary): ");
		Employee emp2 = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());

		System.out.println("Details of Employee 1: ");
		emp2.displayEmployeeDetails();

		sc.close();
	}
}
