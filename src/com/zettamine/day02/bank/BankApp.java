package com.zettamine.day02.bank;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
	    Account acc = null;
		
		String name;
		long accNum;
		float depAmt, withAmt;
		int accType=0;
		
		Scanner scan = new Scanner(System.in);
		int option = 0;
		while (option != 7) {
			System.out.println("1.create Account\n2.Deposit\n3.Withdraw\n4.Detils\n5.Add Interest\n6.Add Service Charge\n7.Exit");
			System.out.print("Enter option:");
			option = scan.nextInt();
			switch (option) {
			case 1:
				System.out.print("Enter AC Number:");
				accNum = scan.nextLong();
				scan.nextLine();
				System.out.print("Enter name:");
				name = scan.nextLine();
				System.out.println("Enter initial Deposit:");
				depAmt = scan.nextFloat();
				System.out.println("Enter Acc Type\n1.Current Account\n2.Savings Account");
				accType = scan.nextInt();
				if (accType == 1) {
					acc = new CurrentAccount(accNum, name, "Current Account", depAmt, 15);
					
					System.out.println("Current Account Opened Successfully | Transaction limit is 15");
				} else if (accType == 2) {
					
					acc = new SavingsAccount(accNum, name, "Saving Account", depAmt, 5);
					
					System.out.println("Savings Account Opened Successfully | Rate of Interest is 5%");
				}
				break;

			case 2:
				if (acc==null)
					System.out.println("Please Opean A/C with us");
				else {
					System.out.print("Enter amount to deposit:");
					depAmt = scan.nextFloat();
					if(accType==1)
					   acc.deposit(depAmt);
					else
					   acc.deposit(depAmt);
					System.out.println("Deposit Successfull");
				}
				break;
			case 3:
				if (acc==null)
					System.out.println("Please Opean A/C with us");
				else {
					System.out.print("Enter amount to withdraw:");
					withAmt = scan.nextFloat();
					if(accType==1)
						acc.withdraw(withAmt);
						else
						acc.withdraw(withAmt);
					}
				break;
			case 4:
				if (acc==null)
					System.out.println("Please Opean A/C with us");
				else {
					// System.out.println("A/C NO:"+cus1.getAccNum()+" | "+"
					// NAME:"+cus1.getCustName()+" | "+"Balance "+cus1.getBal());
					if(accType==1)
						((CurrentAccount) acc).details();
						else
						((SavingsAccount) acc).details();
				}
				break;
			case 5:
				if(acc==null) {
					System.out.println("Please Opean A/C with us");
				}else if(acc instanceof CurrentAccount)
					System.out.println("This opertaion is only supported for Saving account");
				else
				{
					((SavingsAccount) acc).addInterest();
					System.out.println("Interest added successfully");
				}
				break;
			case 6:
				if(acc==null) {
					System.out.println("Please Opean A/C with us");
				}else if(acc instanceof SavingsAccount)
					System.out.println("This opertaion is only supported for Svaings account");
				else
				{
					float charges =((CurrentAccount) acc).addCharge();
					System.out.println("Serivce charge added successfully | Rs. "+charges);
				}
				break;
			case 7:
				System.out.println("Bye Bye");
				System.exit(0);
				break;
		    default:
		    	System.out.println("Inavlid Option");
		    	break;

			}
		}
		scan.close();

	}

}
