package com.zettamine.day03.student;

public class Hosteller extends Student {
	private String hostelName;
	private int roomNo;

	public Hosteller(int stId, String stName, int depId, String gender, long phNo,String hostelName,int roomNo) {
		super(stId, stName, depId, gender, phNo);
		this.hostelName=hostelName;
		this.roomNo=roomNo;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public int getRoomNo() {
		return roomNo;
	}

}
