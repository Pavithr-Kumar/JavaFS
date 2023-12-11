package com.zettamine.day02.bank;

public class SavingsAccount extends Account {
     private float roi;
	public SavingsAccount(long accNum, String custName, String accType, float bal,float roi) {
		super(accNum, custName, accType, bal);
		this.roi=roi;
	}
	public void details() {
		System.out.println("Name : \t"+super.getCustName());
		System.out.println("Acc No :\t"+super.getAccNum());
		System.out.println("Acc Type :\t"+super.getAccType());
		System.out.println("Balance :\t"+super.getBal());
		System.out.println("Rate of Interest:"+this.roi);
	}
	
   public void addInterest() {
	   this.setBal((float) (this.getBal()+this.getBal()*(0.05)));
   }
	

}
