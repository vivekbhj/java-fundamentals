package javafullcourse;

import java.util.Scanner;

public class Widening {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Eneter any Character");

			char c = s.next().charAt(0);
			int v = c; // Implicit in nature
			System.out.println("The integer value is " + v);

		}

	}
}
