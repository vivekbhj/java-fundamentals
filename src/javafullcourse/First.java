package javafullcourse;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {

		int pwd;
		System.out.print("Enter your password :");
		Scanner obj = new Scanner(System.in);
		pwd = obj.nextInt();
		if (pwd == 1122) {
			System.out.print("sam is ladaki chitt");
		} else {
			System.out.print("Sam is Khasma nu khani");
		}

	}

}