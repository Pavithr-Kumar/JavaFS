package com.zettamine.day04.area_volume_calculator;

public class Rectangle extends Shape {

	private double length;
	private double width;

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		return this.length * this.width;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return -1;
	}

}
