package com.zettamine.day04.vehicle_loan_insurance;

public class VehicleLoanAndInsurance {

	public static void main(String[] args) {
		Vehicle car = new Vehicle("TS39JB5093", "Toyota Innova", "4 wheeler", 400000);
		System.out.println("Loan Issued for "+car.getModelName()+" Rs."+car.issueLoan());
		System.out.println("Insurance Amount for "+car.getModelName()+" Rs."+car.takeInsurance());
		System.out.println("-".repeat(70));
		
		
		Vehicle bike = new Vehicle("TS78HJ7869", "Bajaj Pulasr", "2 wheeler", 200000);
		System.out.println("Loan Issued for "+bike.getModelName()+" Rs."+bike.issueLoan());
		System.out.println("Insurance Amount for "+bike.getModelName()+" Rs."+bike.takeInsurance());

	}

}
