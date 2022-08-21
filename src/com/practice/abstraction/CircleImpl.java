package com.practice.abstraction;

public class CircleImpl implements IShape {
	private double pie = 3.14;
	private double radius;

	public CircleImpl(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return pie * radius * radius;
	}

	@Override
	public void draw() {
		System.out.println("We are drawing area");

	}

}
