package com.zettamine.day02;

import java.util.Scanner;

public class Student {
	private int studentId;
	private String studentName, studentAddress,collegeName="NIT";
	
	public Student(int studentId, String studentName, String studentAddress) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	public Student(int studentId, String studentName, String studentAddress, String collegeName) {
		this(studentId,studentName,studentAddress);
		this.collegeName = collegeName;
	}
	
	private void displayDetails() {
		System.out.println("Student id:"+this.studentId);
		System.out.println("Student name: "+this.studentName);
		System.out.println("Address:"+this.studentAddress);
		System.out.println("College name: "+this.collegeName);
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
       int sId;
       Student stu;
       String sName, sAddress="", sCollege,temp="";
       System.out.print("Enter Student's Id:");
       sId=scan.nextInt();
       scan.nextLine();
       while(true) {
    	   System.out.print("Enter Student's Name:");
    	   sName=scan.nextLine();
    	   if(sName.matches("[A-Za-z ]+"))
    	   break;
    	  
    	  System.out.println("Inavlid name, try again");
       }
       System.out.print("EnterStudent's Address:");
       sName=scan.nextLine();
       boolean b =true;
       while(b) {
    	   System.out.print("Whether the student is from NIT(Yes/No):");
    	   temp=scan.nextLine();
    	   if(temp.equalsIgnoreCase("Yes")||temp.equalsIgnoreCase("No"))
    		   b=false;
    	   else
    		   System.out.println("Wrong Input");
       }
       if(temp.equalsIgnoreCase("NO")) {
    	   System.out.println("Enter the college name:");
    	   sCollege=scan.nextLine();
    	   stu = new Student(sId, sName, sAddress, sCollege);
       }
       else
    	   stu = new Student(sId, sName, sAddress);
       
       stu.displayDetails();
	}

}
