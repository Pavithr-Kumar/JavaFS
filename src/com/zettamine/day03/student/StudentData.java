package com.zettamine.day03.student;

import java.util.Scanner;

public class StudentData {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Hosteller s1 = getHostellerDetails();
		System.out.println("Modify Room Number(Y/N): ");
        String opt1 = scan.next();
        if(opt1.equalsIgnoreCase("y")) {
        	System.out.println("New Room Number:");
        	s1.setRoomNo(scan.nextInt());
        }
        
        System.out.println("Modify Phone Number(Y/N): ");
       opt1 = scan.next();
        if(opt1.equalsIgnoreCase("y")) {
        	System.out.println("New Phone Number:");
        	s1.setPhNo(scan.nextLong());
        }
        
        System.out.println("The Student Details are as follows:");
        System.out.println("Student ID:"+s1.stId);
        System.out.println("Student Name:"+s1.stName);
       
        System.out.println("Department Id"+s1.depId);
        System.out.println("Gender[M/F]:"+s1.gender);
        System.out.println("Phone Number"+s1.phNo);
        System.out.println("Hostel Name:"+s1.getHostelName());
        System.out.println("Room Number:"+s1.getRoomNo());
        	
        
        
	}
	public static Hosteller getHostellerDetails() {
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
        return new Hosteller(stId, stName, depId, stGender, phNo, hostelName, roomNo);
	}

}
