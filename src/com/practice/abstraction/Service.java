package com.practice.abstraction;

public class Service {

	public static void main(String[] args) {
		Shape shape = new Rectangle("rectangle", 5, 6);
		shape.draw();
		double recArea = shape.area();
		System.out.println("Area is " + recArea);
		Shape shape2 = new Circle("Circle", 6);
		shape2.draw();
		double cirArea = shape2.area();
		System.out.println("Area is " + cirArea);

	}

}
