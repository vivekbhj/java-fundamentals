package javafullcourse;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		int num;
		int i;
		int result = 1;
		System.out.print("Enter any number:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();

		for (i = 1; i <= num; i++)

		{

			result = result * i;
		}
		System.out.println("Factorial is :" + result);

		// TODO Auto-generated method stub

	}

}
