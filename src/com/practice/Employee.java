package com.practice;

public class Employee {

	private String name;
	private int employeeId;
	private static final String company = "HCL";

	public Employee() {// no parameter constructor, constructor is a special method to created objects
						// of a class and it has same name as that of a class and it has no return type

	}

	public Employee(String name, int employeeId) {// parameterized constructor
		super();
		this.name = name;// this is a keyword to remove ambiquity
		this.employeeId = employeeId;
	}

	public String getName() { // here String is return type
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() { // note -but we can only access static variable in static method
		// company="abcd"; // because of final variable we can not change company's
		// name.
		return company;
	}

	public int getEmployeeId() {// getter method
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {// setter Method
		this.employeeId = employeeId;
	}

	public void display() {
		System.out.println("Employee Name is:" + name);
		System.out.println("Employee Id is:" + employeeId);
	}

}
