package com.zettamine.day03.cms;

public class Student {
	 static int stuCount =100;
	final static String College_Name="ZIT";
	private String id;
	private String name;
	private String email;
	public Student(String name, String email) {
		super();
		this.name = name;
		this.email = email;
		stuCount++;
		this.id="Zetta_"+stuCount;
	}
	
	@Override
	public String toString() {
		return this.id + "\t"+this.name + "\t" +this.email + "\t\t"+Student.College_Name + "\t";
	}
	

}
