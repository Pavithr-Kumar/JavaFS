package com.zettamine.day06.student_list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		HashMap<String,Integer> locDetails;
		List<Student> stuList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		String name,email,location;
		long mobile;
		String opt ="";
		while(true) {
			System.out.println("Enter Student’s Name, Location, Email and Mobile:  ");
			name =scan.next();
			location = scan.next();
			email = scan.next();
			mobile = scan.nextLong();
			stuList.add(new Student(name, location, email, mobile));
			System.out.print("Do you want to add more students[Y/N]: ");
			opt = scan.next();
			if(opt.equalsIgnoreCase("n"))
				break;
			else
				continue;
			
		}
		
		locDetails = StudentReport.getReport(stuList);
		System.out.println("Location\t Count");
       for(Map.Entry<String, Integer> entry:locDetails.entrySet())
    	   System.out.printf("%-18s %d\n",entry.getKey(),entry.getValue());
      
       scan.close();    	   
	}

}
