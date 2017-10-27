/**
 * AbecedarianTest.java
 * @author Ben Durham
 * @version 20171025
 * Tests to see if a word is Abecedarian
 * Chapter 4, Exercise 5
 */

import java.util.Scanner;

public class AbecedarianTest {
	/**
 	 * checks to see if a string is abecedarian
 	 *
 	 * @param str the string to check
 	 * @return    whether or not it is abecedarian
 	 */ 
	public static boolean isAbecedarian(String str) {
		str = str.toLowerCase();
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) > str.charAt(i + 1)) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner kbd = new Scanner(System.in);
		
		// Introduce the program
		System.out.println("Welcome to Abecedarian Tester! This program checks to see if a word is abecedarian.");
		
		// Prompts the user for a word
		System.out.print("Enter a word: ");
		String input = kbd.nextLine();
		
		// Close Scanner
		kbd.close();

		// Checks to see if the word is abecedarian and reacts accordinglu
		if (isAbecedarian(input)) System.out.printf("%s is abecadarian!\n", input);
		else System.out.printf("%s is not abecedarian.\n", input);
	}
}
