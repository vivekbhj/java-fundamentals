package com.practice.abstraction;

public class Rectangle extends Shape {
	private double length;
	private double breadth;

	public Rectangle(String objectName, double length, double breadth) {
		super(objectName);
		this.length = length;
		this.breadth = breadth;

	}

	@Override // this is override annotation.
	public double area() {

		return length * breadth;
	}

}
