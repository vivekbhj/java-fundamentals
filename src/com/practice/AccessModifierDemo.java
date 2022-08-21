package com.practice;

import com.practice.inheritance.Animal;

public class AccessModifierDemo extends Animal {
	public void test() {
		Animal animal = new Animal();
		animal.colour = "red";
		animal.legs = 4;
		animal.weight = 4;
		name = "abcd";

	}

}
