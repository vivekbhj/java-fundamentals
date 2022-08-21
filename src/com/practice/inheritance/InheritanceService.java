package com.practice.inheritance;

public class InheritanceService {

	public static void main(String[] args) {

		Dog dog = new Dog();
		// Animal dog = new Animal();
		dog.display();// in overriding child class will be called
		dog.name = "sheru";
		if (dog instanceof Animal) {
			((Dog) dog).displayName(); // this is run time exception because in line 8 dog object refers to Animal
										// class which Can not downcast to Dog class
		}
		Animal animal = new Dog();
		animal.name = "tommy";
		if (animal instanceof Dog) {
			((Dog) animal).displayName(); // downcasting
		}
	}

}
