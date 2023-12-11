package com.zettamine.day02.employee_loan_eligibility;

public class LoanEligibilityCheck {

	public static void main(String[] args) {
		Employee emp1 = new TemporaryEmployee(123, "Ravi Kumar", 8, 300);
		emp1.calculateSalary();
		Loan loan =new Loan();
		System.out.println("Loan Amount  for Temporary Employee "
		                   +emp1.employeeName+" : "+loan.calculateLoanAmount(emp1));
		
       Employee emp2 = new PermanentEmployee(123, "Gowri Shankar", 20000);
       emp2.calculateSalary();
       System.out.println("Loan Amount  for Temporary Employee "
    		   +emp2.employeeName+" : "+loan.calculateLoanAmount(emp2));
	}

}
