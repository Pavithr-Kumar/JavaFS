package com.zettamine.day02.employee_loan_eligibility;

public class PermanentEmployee extends Employee{
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}

	private double basicPay;

	@Override
	public void calculateSalary() {
		double pfAmount = basicPay * 0.12;
		this.salary= basicPay -	pfAmount;
	
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	
	

}
