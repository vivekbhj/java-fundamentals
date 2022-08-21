package javafullcourse;

import java.util.Scanner;

public class Narrowing {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Enter any integer");
			int v = s.nextInt();
			char w = (char) v; // Explicit in nature
			System.out.println("Character value of given integer is " + w);

		}

	}
}
