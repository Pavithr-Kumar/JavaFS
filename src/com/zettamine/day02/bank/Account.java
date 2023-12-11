package com.zettamine.day02.bank;

public class Account {
	private long accNum;
	private String custName;
	private String accType;
	private float bal;
	public Account(long accNum, String custName, String accType, float bal) {
		super();
		this.accNum = accNum;
		this.custName = custName;
		this.accType = accType;
		this.bal = bal;
	}
	
	public float checkBalance() {
		return this.bal;
	}
	
	public void deposit(float depAmount) {
		this.bal +=  depAmount;
		
	}
	
	public void withdraw(float withdrawAmount) {
		if(this.bal<withdrawAmount) {
			System.out.println("Insufficient Balance...");
			System.exit(0);
		}else {
			System.out.println("Withdraw Successfull");
			this.bal-=withdrawAmount;
		}
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public float getBal() {
		return bal;
	}

	public void setBal(float bal) {
		this.bal = bal;
	}
	

}
