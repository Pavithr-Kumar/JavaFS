package com.zettamine.day01;

import java.util.Scanner;

public class MovieTicketCalculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	int noOfTickets;
	char refresehment,couponCode,circle;
	System.out.print("Enter the no of tickets: ");
	noOfTickets=scan.nextInt();
	if(!(noOfTickets<41 && noOfTickets >4)) {
		System.out.println("Minimum of 5 and Maximum of 40 Tickets");
		System.exit(0);
	}
	System.out.print("Do you want refreshment: ");
	refresehment = scan.next().charAt(0);
	System.out.print("Do you have coupon code: ");
	couponCode = scan.next().charAt(0);
	System.out.print("Enter the circle: ");
	circle = scan.next().charAt(0);
	float total=0.0f;
	if(noOfTickets>20) {
		if(couponCode=='Y') {
			if(refresehment=='Y') {
				if(circle=='K')
					total = (float)((noOfTickets * (75 + 50))*(0.88) );
				else if(circle=='Q')
					total = (float)((noOfTickets * (150 + 50))*(0.88) );
					
			}
			else if(refresehment=='N') {
				if(circle=='K')
					total = (float)((noOfTickets * ( 75 ))*(0.88) );
				else if(circle=='Q')
					total = (float)((noOfTickets * ( 150 ))*(0.88) );
			}
		}
		else {
			if(refresehment=='Y') {
				if(circle=='K')
					total = (float)((noOfTickets * (75 + 50))*(0.90) );
				else if(circle=='Q')
					total = (float)((noOfTickets * (150 + 50))*(0.90) );
					
			}
			else if(refresehment=='N') {
				if(circle=='K')
					total = (float)((noOfTickets * ( 75 ))*(0.90) );
				else if(circle=='Q')
					total = (float)((noOfTickets * ( 150 ))*(0.90) );
			}
		}
	}
	else {
		if(couponCode=='Y') {
			if(refresehment=='Y') {
				if(circle=='K')
					total = (float)((noOfTickets * (75 + 50))*(0.98) );
				else if(circle=='Q')
					total = (float)((noOfTickets * (150 + 50))*(0.98) );
					
			}
			else if(refresehment=='N') {
				if(circle=='K')
					total = (float)((noOfTickets * ( 75 ))*(0.98) );
				else if(circle=='Q')
					total = (float)((noOfTickets * ( 150 ))*(0.98) );
			}
		}
		else {
			if(refresehment=='Y') {
				if(circle=='K')
					total = (float)((noOfTickets * (75 + 50)) );
				else if(circle=='Q')
					total = (float)((noOfTickets * (150 + 50)) );
					
			}
			else if(refresehment=='N') {
				if(circle=='K')
					total = (float)((noOfTickets * ( 75 )) );
				else if(circle=='Q')
					total = (float)((noOfTickets * ( 150 )) );
			}
		}
	}
	
	System.out.println("Ticket Cost : "+total);
scan.close();
	}

}
