package com.zettamine.day04.contact_details;

public class Student {
	protected int stId;
	protected String stName;
	protected int depId;
	protected String gender;
	protected long phNo;
	protected Hosteller hosDetails;
	public Student(int stId, String stName, int depId, String gender, long phNo, Hosteller hosDetails) {
		super();
		this.stId = stId;
		this.stName = stName;
		this.depId = depId;
		this.gender = gender;
		this.phNo = phNo;
		this.hosDetails = hosDetails;
	}
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public Hosteller getHosDetails() {
		return hosDetails;
	}
	public void setHosDetails(Hosteller hosDetails) {
		this.hosDetails = hosDetails;
	}
	

}
