package com.practice.inheritance;

public class Dog extends Animal {
	// public class Dog extends Animal, Mammals{ due to diamond condition, multiple
	// inheritance is not possible

	public void displayName() {
		System.out.println(name);

	}

	public void display() {// this is called overriding. same method name in parent and child class same
							// argumenmts and return type should be same or
							// co-varient type.
		// super.display();
		System.out.println("This is dog class");
	}

	public Dog() {
		super();
		System.out.println("Creating dog instance");

	}

}
