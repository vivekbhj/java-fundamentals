package javafullcourse;

import java.util.Scanner;

public class Elseiff {

	public static void main(String[] args) {
		int marks;
		System.out.print("Enter Marks:");
		Scanner obj = new Scanner(System.in);
		marks = obj.nextInt();

		if (marks >= 60 && marks <= 100) {
			System.out.print("FirstDivision");
		} else if (marks >= 45 && marks < 60) {
			System.out.print("Second division");
		} else if (marks >= 33 && marks < 45) {
			System.out.print("Third division");
		} else {
			System.out.print("Fail");
		}
		// TODO Auto-generated method stub

	}

}
