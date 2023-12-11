package com.zettamine.day02.employee_loan_eligibility;

public class TemporaryEmployee extends Employee {

  private  int  hoursWorked;
  private  int hourlyWages;
public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
	super(employeeId, employeeName);
	this.hoursWorked = hoursWorked;
	this.hourlyWages = hourlyWages;
}
@Override
public void calculateSalary() {
	this.salary =  this.hourlyWages * this.hoursWorked;
	
}

}
