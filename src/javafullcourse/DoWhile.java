package javafullcourse;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int num;
		System.out.print("Enter any number");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		do {
			System.out.println(num);
			num++;
		} while (num <= 10);

		// TODO Auto-generated method stub

	}

}