package com.practice;

import java.util.Scanner;

public class CalculatorService {

	public static void main(String[] args) {
		Calculator calculator = new Calculator(); // object of Calculator class
		System.out.println("Enter first number");

		int x, y;
		String op;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		System.out.println("Enter second number");
		y = sc.nextInt();
		System.out.println("What operation do you want to perform");
		op = sc.next();
		System.out.println(op);
		if (op.equals("add")) {
			System.out.println("Sum of two numbers is :" + calculator.add(x, y, 5)); // + is concatanation

		} else if (op.equals("addition")) {
			System.out.println(Calculator.add(x, y));
		} else if (op.equals("sub")) {
			System.out.println("Subtraction of two numbers is :" + calculator.subtraction(x, y));

		} else if (op.equals("mul")) {
			System.out.println("Multiplication of two numbers is :" + calculator.multiplication(x, y));
		} else if (op.equals("div")) {
			System.out.println("Division of two numbers is :" + calculator.division(x, y));
		}

	}
}
