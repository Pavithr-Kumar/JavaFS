package com.zettamine.day04.vehicle_loan_insurance;

public class Vehicle implements Insurance,Loan{
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	public Vehicle(String vehicleNumber, String modelName, String vehicleType, double price) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType = vehicleType;
		this.price = price;
	}
	
	
	public String getModelName() {
		return modelName;
	}


	@Override
	public double issueLoan() {
		double loan=0;
		if(this.vehicleType.equalsIgnoreCase("4 wheeler"))
			loan = this.price * 0.8;
		else if(this.vehicleType.equalsIgnoreCase("3 wheeler"))
			loan = this.price * 0.75;	
		else if(this.vehicleType.equalsIgnoreCase("2 wheeler"))
			loan = this.price * 0.5;	
		return loan;
	}
	@Override
	public double takeInsurance() {
		double insAmt=0;
		if(this.price<=150000 )
			insAmt =3500;
		else if(this.price >150000 && this.price <=300000 )
			insAmt = 4000;
		else if(this.price > 300000)
			insAmt=5000;
		return insAmt;
	}
	

}
