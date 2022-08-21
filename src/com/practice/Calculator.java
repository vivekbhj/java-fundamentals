package com.practice;

public class Calculator {
	public static int add(int a, int b) { //static method belongs to the class and it can be accessed by class name.
		return a + b;
	}

	public int subtraction(int a, int b) {
		return a - b;
	}

	public int multiplication(int a, int b) {
		return a * b;
	}

	public int division(int a, int b) {
		return a / b;
	}

	public int add(int x, int y, int z) { // Same method name but different arguments. called Method overloading(compile
											// time polymorphism)
		return x + y + z;
	}

	public float add(float a, int b) {
		return a + b;
	}

}
