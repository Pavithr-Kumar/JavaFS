package com.zettamine.day04.account_manipulation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int accNo,cusId;
		String cusName,cusEmail;
		double bal,minBal,withdrawAmount;
		System.out.println("enter A/C number: ");
		accNo= scan.nextInt();
		System.out.println("enter customer id: ");
		cusId=scan.nextInt();
		scan.nextLine();
		System.out.println("enter customer name: ");
		cusName=scan.nextLine();
		System.out.println("enter customer email: ");
		cusEmail=scan.nextLine();
		Customer cus = new Customer(cusId, cusName, cusEmail);
		System.out.println("enter balance: ");
		bal = scan.nextDouble();
	    System.out.println("enter minimum balance: ");
	    minBal=scan.nextDouble();
	    Account cusAcc = new SavingsAccount(accNo, cus, bal, minBal);
	    System.out.println("enter amount to withdraw: ");
	    withdrawAmount=scan.nextDouble();
	    if(cusAcc.withdraw(withdrawAmount)) 
	    	System.out.println("Rs. "+withdrawAmount+" debited"+" | "+"Balance: "+cusAcc.getBalance());
	    else
	    	System.out.println("Rs. "+withdrawAmount+" exceeds minimum balance: "+((SavingsAccount) cusAcc).getMinimumBalance());
		

	}

}
