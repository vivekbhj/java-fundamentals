package javafullcourse;

import java.util.Scanner;

public class Nestedif {
	public static void main(String[] args) {

		int num1, num2, num3;
		System.out.print("Enter three numbers");
		Scanner obj = new Scanner(System.in);
		num1 = obj.nextInt();
		num2 = obj.nextInt();
		num3 = obj.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.print("Maximum Number:" + num1);
			} else {
				System.out.print("Maximum Number:" + num3);
			}
		} else {
			if (num2 > num3) {
				System.out.print("Maximum Number:" + num2);
			} else {
				System.out.print("Maximum Number:" + num3);
			}
		}
	}

}
