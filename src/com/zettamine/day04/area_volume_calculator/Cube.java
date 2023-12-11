package com.zettamine.day04.area_volume_calculator;

public class Cube extends Shape implements Spatial {

	private double length;
	private double width;
	private double height;
	
	public Cube(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return 2*this.height *this.length + 2* this.height  *this.width + 2* this.length* this.width;
	}

	@Override
	public double volume() {
		return this.length * this.height *this.width;
	}

}
