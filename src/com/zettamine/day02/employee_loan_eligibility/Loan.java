package com.zettamine.day02.employee_loan_eligibility;

public class Loan {
	public double calculateLoanAmount(Employee employeeObj) {
		double loan=0;
		if(employeeObj instanceof PermanentEmployee ) {
			
			loan = employeeObj.salary * 0.15;
			System.out.println("Perm");
		}
		else if(employeeObj instanceof TemporaryEmployee) {
			System.out.println("Temp");
			loan = employeeObj.salary * 0.10;
		}
		return loan;
		
	}

}
