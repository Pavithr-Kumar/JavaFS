package com.zettamine.day06.phone_book_manipulation;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
	private List<Contact> phonebook = new ArrayList<>();

	
	public List<Contact> getPhonebook() {
		return phonebook;
	}

	public void setPhonebook(List<Contact> phonebook) {
		this.phonebook = phonebook;
	}
	 public void addContact(Contact obj) {
		 this.phonebook.add(obj);
	 }
	 
	 public List<Contact> viewAllContacts(){
		 return this.phonebook;
	 }
	 public Contact viewContactByPhoneNo(long phNo) {
		 
		 for(Contact cnt:this.phonebook) {
			 if(cnt.getPhoneNumber()==phNo)
				return cnt;
		 }
		 return null;
	 }
	 public boolean removeContact(long phNo) {
		 
		 return this.phonebook.removeIf(i->i.getPhoneNumber()==phNo);
		 
	 }
	 

}
