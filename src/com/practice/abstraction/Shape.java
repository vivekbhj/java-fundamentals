package com.practice.abstraction;

public abstract class Shape {
	private String objectName;

	public Shape(String objectName) {
		this.objectName = objectName;

	}

	abstract public double area(); // this is abstract method. And does not have any body.

	public void draw() {
		System.out.println("We are drawing " + this.objectName);

	}

}
