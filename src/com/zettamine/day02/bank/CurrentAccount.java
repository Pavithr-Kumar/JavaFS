package com.zettamine.day02.bank;

public class CurrentAccount extends Account {

	private int transactionLimit;
	public CurrentAccount(long accNum, String custName, String accType, float bal,int transactionLimit) {
		super(accNum, custName, accType, bal);
		this.transactionLimit=transactionLimit;
		
	}
	@Override
	public void deposit(float depAmount) {
		if(transactionLimit>0) {
			super.deposit(depAmount);
			transactionLimit--;
		}
		
	}
	@Override
	public void withdraw(float withdrawAmount) {
		
		if(transactionLimit>0) {
			super.withdraw(withdrawAmount);
			transactionLimit--;
		}
	}
	
	public void details() {
		System.out.println("Name : \t"+super.getCustName());
		System.out.println("Acc No :\t"+super.getAccNum());
		System.out.println("Acc Type :\t"+super.getAccType());
		System.out.println("Balance :\t"+super.getBal());
		System.out.println("Transaction limit:"+this.transactionLimit);
	}
	
	public float addCharge() {
		if(transactionLimit>=0)
			System.out.println("Transactions Limit not exceeded!! | Limit : "+transactionLimit);
		int noOfTransactionsExceededLimit = transactionLimit<0? 0-transactionLimit:0;
		this.deposit(noOfTransactionsExceededLimit * 10.0f);
		return noOfTransactionsExceededLimit * 10.0f;
	}

}
