package com.monocept.test;

import com.monocept.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {

//		Details of Employee 1
		Employee emp1 = new Employee();
		emp1.setId(1001);
		emp1.setName("Peter");
		emp1.setSalary(10_00_000);

		System.out.println("Details of Employee 1: ");
		emp1.displayEmployeeDetails();
		System.out.println();

//		Details of Employee 2
		Employee emp2 = new Employee(1002, "John", 20_000_000);

		System.out.println("Details of Employee 2: ");
		System.out.println("Employee id: " + emp2.getId());
		System.out.println("Employee Name: " + emp2.getName());
		System.out.println("Employee Salary: " + emp2.getSalary());

	}
}
