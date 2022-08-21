package javafullcourse;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		int num;
		System.out.print("Enter any number");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		while (num <= 100) {
			if (num % 2 == 0) {
				System.out.println(num + "Even number");
				// break;
			} else {
				System.out.println(num + "Odd number");
				// break;
			}
			++num;

		}

		// TODO Auto-generated method stub

	}

}
