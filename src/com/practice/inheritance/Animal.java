package com.practice.inheritance;

public class Animal {
	protected String name;
	public String colour;
	private int legs;
	int weight;

	public void display() {
		System.out.println("This is animal calss ");
	}

	void eat() {
		System.out.println("Eating..");
	}

	public Animal() {
		System.out.println("Creating animal instance");
	}

}
