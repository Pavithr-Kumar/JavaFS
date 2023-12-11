package com.zettamine.day01;

import java.util.Scanner;

public class StringConcatenation {

	public static void main(String[] args) {
		String name ="";
		String fatherName ="";
		Scanner scan = new Scanner(System.in);
		System.out.print("Inmate's name: ");
		name = scan.nextLine();
		System.out.print("Inmate's father's name: ");
		fatherName = scan.nextLine();
		String fullName = name +" "+ fatherName;
		if(fullName.matches("[a-zA-Z ]+"))
		   System.out.println(fullName);
		else
			System.out.println("Invalid Name");
		scan.close();

	}

}
