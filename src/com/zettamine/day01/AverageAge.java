package com.zettamine.day01;

import java.util.Scanner;

public class AverageAge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalEmp,sum=0;
		System.out.print("Enter total no of employees:");
		totalEmp = scan.nextInt();
		if(totalEmp<2) {
			System.out.println("Please enter a valid employee count");
			System.exit(0);
		}
			
		int[] employeeAge = new int[totalEmp];
		System.out.println("Enter the age for "+totalEmp+" employees:");
		for(int i=0;i<employeeAge.length;i++) {
			employeeAge[i] = scan.nextInt();
			sum = sum + employeeAge[i];
		}
		scan.close();
		System.out.printf("The average age is %.2f",(float)(sum/totalEmp));
			
		

	}

}
