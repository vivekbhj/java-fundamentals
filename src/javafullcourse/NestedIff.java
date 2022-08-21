package javafullcourse;

import java.util.Scanner;

public class NestedIff {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the age of the person");
			int age = sc.nextInt();

			if (age >= 18) {
				System.out.println("Enter the weight of the person");
				int weight = sc.nextInt();
				if (weight >= 50) {

					System.out.println("Person is eligible to donate blood");
				} else {
					System.out.println("not eligible");
				}
			} else {
				System.out.println("not eligible"); 
			}
		}
	}

}
