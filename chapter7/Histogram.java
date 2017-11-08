/**
 * Histogram.java
 * @author Ben Durham
 * @version 20171107
 * Chapter 7, Exercise 7
 */

import java.util.Arrays;
import java.util.Scanner;

public class Histogram {
	/**
	 * Creates a histogram of the letter in a given word
	 *
	 * @param str	the string to make a histogram of
	 * @return 	an array representing a histogram of the letters in the
	 * 		word
	 */
	public static int[] letterHist(String str) {
		// Creates an array to hold the histogram
		int[] result = new int[26];

		// Converts the string to lowercase
		str = str.toLowerCase();

		// Iterates through the string and update the histogram
		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			int index = letter - 'a';
			result[index]++;
		}
		
		// Returns the result
		return result;
	}

	public static void main(String[] args) {
		// Creates an instance of the Scanner object
		Scanner kbd = new Scanner(System.in);
		
		// Introduces the user to the program
		System.out.println("Welcome to Histogram.java. This program "
				+ "creates a histogram of the letters in a "
				+ "given word.");
		
		// Prompts the user for a string
		System.out.print("Enter a string: ");
		String input = kbd.next();

		// Returns the output
		System.out.println("Here is a histogram of the letters in that"
				+ " word:");
		System.out.println(Arrays.toString(letterHist(input)));
	}
}
