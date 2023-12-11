package com.zettamine.day02.ticket_price;

import java.util.Scanner;

public class Ticket {
	
	
	private int ticketid;
	private int price;
	private static int availableTickets;
	
	public Ticket(int ticketid, int price) {
		super();
		this.ticketid = ticketid;
		this.price = price;
	}

	public static int calculateTicketCost(int nooftickets) {
		if(nooftickets<availableTickets)
			availableTickets-=nooftickets;
		return -1;
	}

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getAvailableTickets() {
		return availableTickets;
	}

	public static void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = availableTickets;
	}

	
}
