package com.zettamine.day04.area_volume_calculator;

public class Triangle extends Shape {

	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		return 0.5 * this.height * this.base;
	}

	@Override
	public double volume() {
		return -1;
	}

}
