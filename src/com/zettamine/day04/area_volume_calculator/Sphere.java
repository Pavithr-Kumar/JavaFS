package com.zettamine.day04.area_volume_calculator;

public class Sphere extends Shape implements Spatial{

	private double  radius;
	
	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		return 4 * Math.PI * this.radius * this.radius;
	}

	@Override
	public double volume() {
		return (4 * Math.PI * this.radius * this.radius * this.radius)/3;
	}

}
