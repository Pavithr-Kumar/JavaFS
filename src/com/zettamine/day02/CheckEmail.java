package com.zettamine.day02;

public class CheckEmail {

	public static void main(String[] args) {
		String email="abc@gmail.com";
		if(email.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9.-]+$"))
			System.out.println("It is valid email id");
		else
			System.out.println("Not a valid email id");

	}

}
