package com.zettamine.day04.contact_details;

import java.util.Scanner;



public class StudentData {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Student s1 = getHostellerDetails();
		System.out.println("Modify Room Number(Y/N): ");
        String opt1 = scan.next();
        if(opt1.equalsIgnoreCase("y")) {
        	System.out.println("New Room Number:");
        	s1.hosDetails.setRoomNo(scan.nextInt());
        }
        
        System.out.println("Modify Phone Number(Y/N): ");
       opt1 = scan.next();
        if(opt1.equalsIgnoreCase("y")) {
        	System.out.println("New Phone Number:");
        	s1.setPhNo(scan.nextLong());
        }
        
        System.out.println("The Student Details are as follows:");
        System.out.println("Student ID:"+s1.getStId());
        System.out.println("Student Name:"+s1.getStName());
       
        System.out.println("Department Id"+s1.getDepId());
        System.out.println("Gender[M/F]:"+s1.getGender());
        System.out.println("Phone Number"+s1.getPhNo());
        System.out.println("Hostel Name:"+s1.hosDetails.getHostelName());
        System.out.println("Room Number:"+s1.hosDetails.getRoomNo());
        	
        
        
	}
	public static Student getHostellerDetails() {
		int stId,depId,roomNo;
		String stName,stGender,hostelName;
		long phNo;
        System.out.println("Enter the Student Details & Hostel Details");
        System.out.print("Student ID:");
        stId = scan.nextInt();
        scan.nextLine();
        System.out.print("Student Name:");
        stName=scan.nextLine();
        System.out.print("Department Id: ");
        depId=scan.nextInt();
        System.out.print("Gender[M/F]:");
        stGender = scan.next();
        System.out.print("Phone Number");
        phNo=scan.nextLong();
        scan.nextLine();
        System.out.print("Hostel Name:");
        hostelName=scan.nextLine();
        System.out.print("Room Number:");
        roomNo=scan.nextInt();
        Hosteller h1 = new Hosteller(hostelName, roomNo);
        return new Student(stId, stName, depId, stGender, phNo, h1);
	}

}
