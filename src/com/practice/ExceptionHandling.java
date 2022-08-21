package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling {
	public int getPlayerScore(String playerFile) throws FileNotFoundException {
		Scanner contents = null;
		try {

			contents = new Scanner(new File(playerFile));
			return Integer.parseInt(contents.nextLine());
		} catch (FileNotFoundException e) {
			System.out.println("Error occured");
			throw e;

		} finally {
			contents.close(); // whenever we create scanner , we should close it.
		}
	}

}
