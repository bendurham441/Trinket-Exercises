/**
 * AnagramChecker.java
 * @author Ben Durham
 * @version 20171107
 * Chapter 7, Exercise 8
 */

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
	/**
	 * Creates a histogram of the letters in a given word
	 *
	 * @param str	the string to create a histogram of
	 * @return 	the histogram of the letters in the string
	 */
	public static int[] generateHistogram(String str) {
		// Creates an array to store the histogram
		int[] histo = new int[26];

		// Converts the string to lowercase
		str = str.toLowerCase();

		// Iterates through the word and increments the array values
		for (int i = 0; i < str.length(); i++) {
			int index = str.charAt(i) - 'a';
			histo[index]++;
		}
		
		// Returns the histogram in the form of an array
		return histo;
	}
	
	/**
	 * Checks to see whether or not two strings are anagrams of ecah other
	 *
	 * @param str1	The first of two strings to check
	 * @param str2 	The second of two strings to check
	 * @return	Whether or not the strings are anagrams
	 * @see generateHistogram
	 */
	public static boolean areAnagrams(String str1, String str2) {
		// Creates histograms of the two words
		int[] str1_histo = generateHistogram(str1);
		int[] str2_histo = generateHistogram(str2);

		// Checks to see if the strings have the same amounts of
		// letters
		for (int i = 0; i < str1_histo.length; i++) {
			if (str1_histo[i] != str2_histo[i]) return false;
		}

		return true;
	}

	/**
	 * Returns a string inputted by the user
	 *
	 * @param in	the scanner to get input from
	 * @return	the string inputted by the user
	 */
	public static String getInput(Scanner in) {
		System.out.print("Enter a string: ");
		return in.next();
	}

	public static void main(String[] args) {
		// Creates a new instance of Scanner object
		Scanner kbd = new Scanner(System.in);
		
		// Introduces the user to the program
		System.out.println("Welcome to AnagramChecker.java!");
		
		// Prompts the user for two strings and stores them
		String input1 = getInput(kbd);
		String input2 = getInput(kbd);

		// Prints the result to the user
		if (areAnagrams(input1, input2)) {
			System.out.printf("%s and %s are anagrams.\n", input1,
					input2);
		} else {
			System.out.printf("%s and %s are not anagrams.\n",
					input1, input2);
		}
	}
}
