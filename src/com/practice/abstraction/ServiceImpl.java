package com.practice.abstraction;

import java.util.Scanner;

public class ServiceImpl {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth");
		int a = sc.nextInt();
		int b = sc.nextInt();
		IShape shape = new RectangleImpl(a, b);

		shape.draw();
		double area = shape.area();

		System.out.println("area of the rectangle is " + area);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the radius");
		int c = sc1.nextInt();
		IShape shape2 = new CircleImpl(c);
		double area2 = shape2.area();
		System.out.println("area of the circle is " + area2);
	}

}
