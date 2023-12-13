package com.zettamine.day06.phone_book_manipulation;

public class Contact {
	private String firstName;
	private String lastName;
	private long phoneNumber;
	private String emailId;
	public Contact(String firstName, String lastName, long phoneNumber, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "First Name: " + firstName + " | Last Name: " + lastName + " |  Phone No: " + phoneNumber
				+ " | Email: " + emailId ;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	

}
