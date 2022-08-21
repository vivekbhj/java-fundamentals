package com.practice.abstraction;

public class RectangleImpl implements IShape {
	private double length;
	private double breadth;
	public RectangleImpl(double length, double breadth) {
	super();
	this.length= length;
	this.breadth=breadth;
		
	}

	@Override
	public double area() {
		
		return length*breadth;
	}

	@Override
	public void draw() {
		System.out.println("We are drawing rectangle");
		
		
	}
	

}
