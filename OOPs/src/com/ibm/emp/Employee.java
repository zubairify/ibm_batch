package com.ibm.emp;

public abstract class Employee {	// Generalised class
	private int empId;
	private String empName;
	private double salary;
	
	private static int autogen;
	
	static {	// Static initialiser block, it executes at the time of class loading
		System.out.println("Employee class ready...");
		autogen = 1001;
	}
	
	public Employee() {
	}

	public Employee(String empName, double salary) {
		this.empId = autogen ++;
		this.empName = empName;
		this.salary = salary;
	}
	
	public void payslip() {
		System.out.println("Emp ID: " + empId);
		System.out.println("Emp Name: " + empName);
		System.out.println("Salary: " + salary);
	}

	public double getSalary() {
		return salary;
	}
}
