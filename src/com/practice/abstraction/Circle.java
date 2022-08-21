package com.practice.abstraction;

public class Circle extends Shape {
	private double radius;
	private static final double pie = 3.14;

	public Circle(String objectName, double radius) {
		super(objectName);
		this.radius = radius;

	}

	@Override
	public double area() {

		return pie * radius * radius;
	}

}
