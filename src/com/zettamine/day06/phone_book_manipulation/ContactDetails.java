package com.zettamine.day06.phone_book_manipulation;

import java.util.List;
import java.util.Scanner;

public class ContactDetails {

	public static void main(String[] args) {
		PhoneBook phBook = new PhoneBook();
		Scanner scan = new Scanner(System.in);
		String fName,lName,email;
		long phNo;
		int opt=0;
		while(opt!=5) {
			System.out.println("1.Add Contact\n2.Display All Contacts\n3.Search contact by Phone\n4.remove Contact\n5.Exit");
			System.out.print("Enter your choice: ");
			opt=scan.nextInt();
			switch(opt) {
			case 1:
				scan.nextLine();
				System.out.println("Add a Contact");
				System.out.print("Enter the First Name: ");
				fName=scan.nextLine();
				System.out.print("Enter the Last Name: ");
				lName=scan.nextLine();
				System.out.print("Enter the Phone No.: ");
				phNo=scan.nextLong();
				scan.nextLine();
				System.out.print("Enter the Email:  ");
				email=scan.nextLine();
				phBook.addContact(new Contact(fName, lName, phNo, email));
				System.out.println("Contact added successfully");
				break;
			case 2:
				List<Contact> list = phBook.viewAllContacts();
				for(Contact cnt:list)
					System.out.println(cnt);
				break;
			case 3:
				System.out.print("Enter the Phone number to search contact: ");
				phNo=scan.nextLong();
				if(phBook.viewContactByPhoneNo(phNo)!=null) {
					
					System.out.println("The Contact is");
					System.out.println(phBook.viewContactByPhoneNo(phNo));
				}
				else
					System.out.println("Contact not available");
				break;
			case 4:
				System.out.print("Enter the Phone number to remove: ");
				phNo=scan.nextLong();
				System.out.print("Do you want to remove the contact (Y/N): ");
				if(scan.next().equalsIgnoreCase("Y")){
					phBook.removeContact(phNo);
					System.out.println("The contact is successfully deleted.");
				}
				break;
			case 5:
				opt =5;
				return;
			default:
				System.out.println("Invalid Option -- Try Again");
					
				
				
			}
		}

	}

}
