package com.monocept.model;

public class Employee {

	private int id;
	private String name;
	private double salary;

//	Constructor 
	public Employee() {
		this.id = 1001;
		this.name = "";
		this.salary = 0.0;
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

//	Getters  
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

//	Setters 
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

//	Display Details of Employee
	public void displayEmployeeDetails() {
		System.out.println("Employee id: " + getId());
		System.out.println("Employee Name: " + getName());
		System.out.println("Employee Salary: " + getSalary());
	}
}
