package com.zettamine.day04.contact_details;

public class Hosteller {

	private String hostelName;
	private int roomNo;
	public Hosteller(String hostelName, int roomNo) {
		super();
		this.hostelName = hostelName;
		this.roomNo = roomNo;
	}
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	
}
