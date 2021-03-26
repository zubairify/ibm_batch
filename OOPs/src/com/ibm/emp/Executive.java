package com.ibm.emp;

public class Executive extends Employee {	// Specialised class
	private double commission;

	public Executive() {
	}

	public Executive(String empName, double salary, double commission) {
		super(empName, salary);
		this.commission = commission;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Commission: " + commission);
	}

	@Override
	public double getSalary() {
		return super.getSalary() + commission;
	}
}
