									package com.practice;

import java.util.Scanner;

public class CalculatorService2 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator(); // object of Calculator class

		int x, y;
		String op;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter first number");
			x = sc.nextInt();
			System.out.println("Enter second number");
			y = sc.nextInt();
			System.out.println("What operation do you want to perform");
			op = sc.next();
			System.out.println(op);

			if (op.equals("add")) {
				System.out.println("Sum of two numbers is :" + calculator.add(x, y)); // + is concatanation

			} else if (op.equals("sub")) {
				System.out.println("Subtraction of two numbers is :" + calculator.subtraction(x, y));

			} else if (op.equals("mul")) {
				System.out.println("Multiplication of two numbers is :" + calculator.multiplication(x, y));
			} else if (op.equals("div")) {
				System.out.println("Division of two numbers is :" + calculator.division(x, y));
			} else if (op.equals("abort")) {
				System.out.println("Program ends");
				break;

			}

		}

	}

}
