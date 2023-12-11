package com.zettamine.day04.account_manipulation;

public class SavingsAccount extends Account {
	private double minimumBalance;

	public SavingsAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance = minimumBalance;
	}

	@Override
	public boolean withdraw(double amount) {
		if(this.balance - amount>= this.minimumBalance) {
			this.balance-=amount;
			return true;
		}
		return false;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}
	

}
