package com.practice;

public class EmployeeService {

	public static void main(String[] args) {
		//Employee emp = new Employee("Vivek",2);
		Employee emp = new Employee();
		emp.setEmployeeId(1);
		//
		emp.setName("Rohi");
		
		//System.out.println("Employee id is: "+emp.getEmployeeId());

		//System.out.println("Employee name is: "+emp.getName());
		emp.display();

	}

}   
