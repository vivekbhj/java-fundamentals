package com.practice;

import java.io.FileNotFoundException;

public class ServiceClass {

	public static void main(String[] args) /* throws Exception */ {
		ExceptionHandling obj = new ExceptionHandling();
		int score = 0;
		try {
			score = obj.getPlayerScore("C:/practice/scor.txt");

		} catch (FileNotFoundException e) {
			System.out.println("File not found " + e.getMessage());

		} finally {
			System.out.println("Finally block will always execute no matter the exception occures or not"); // throw new
																											// Exception("Exception
																											// occured");
																											// }

			// System.out.println("Score is " + score);
			// System.out.println("Thread did not die");
		}

	}
}
