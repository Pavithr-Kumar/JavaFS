package com.zettamine.day02.ticket_price;

import java.util.Scanner;

public class TicketPriceCalculator {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		int id,price,noOfTickets;
		int noOfBookings;
		System.out.print("Enter number of bookings: ");
		noOfBookings = scan.nextInt();
		System.out.println("Enter the available tickets :");
		Ticket.setAvailableTickets(scan.nextInt());
		while(noOfBookings!=0) {
			
			System.out.println("Enter the ticket id: ");
			id =scan.nextInt();
			System.out.println("Enter the price:");
			price =scan.nextInt();
			System.out.println("Enter the no of tickets:");
			noOfTickets=scan.nextInt();
			
			 new Ticket(noOfTickets, price);
			Ticket.calculateTicketCost(noOfTickets);
			System.out.println("Total Amount:"+(noOfTickets * price));
			System.out.println("Available tickets after booking:"+Ticket.getAvailableTickets());
			noOfBookings--;
		}
		scan.close();

	}


}
