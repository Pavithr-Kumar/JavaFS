package com.zettamine.day03.student;

public class Student {
	protected int stId;
	protected String stName;
	protected int depId;
	protected String gender;
	protected long phNo;
	public Student(int stId, String stName, int depId, String gender, long phNo) {
		super();
		this.stId = stId;
		this.stName = stName;
		this.depId = depId;
		this.gender = gender;
		this.phNo = phNo;
	}
	public int getStId() {
		return stId;
	}
	public String getStName() {
		return stName;
	}
	public int getDepId() {
		return depId;
	}
	public String getGender() {
		return gender;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	

}
