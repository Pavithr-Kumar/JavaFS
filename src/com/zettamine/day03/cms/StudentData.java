package com.zettamine.day03.cms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String opt="",name="",email="";
		List<Student> stuList = new ArrayList<>();
		while(true){
			
			if(opt.equalsIgnoreCase("N"))
				break;
			System.out.println("Enter student name and email:");
			name = scan.nextLine();
			email=scan.nextLine();
			stuList.add(new Student(name,email));
			System.out.print("Do you want to add more students? [Y/N] : ");
			opt =scan.nextLine();
		}
		System.out.println("Id\t\tNAME\tEMAIL\t\t\tCOLEGGE_NAME");
		System.out.println("-".repeat(60));
		for (Student student : stuList) {
			System.out.println(student);
		}
		

	}

}
