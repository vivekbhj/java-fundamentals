package javafullcourse;

import java.util.Scanner;

public class Forlloop {

	public static void main(String[] args) {
		int i;
		int num;
		int start = 0;
		System.out.print("Enter any number:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();

		for (i = 1; i <= num; i++) {
			start = start + i;
		}
		System.out.print("Sum of the nembers is :" + start);

	}

}
