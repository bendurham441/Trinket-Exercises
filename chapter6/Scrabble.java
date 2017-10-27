/**
 * Scrabble.java
 * @author Ben Durham
 * @version 20171026
 * Checks to see if a given string contains letters to create a word
 * Chapter 6, Exercise 6
 */

import java.util.Scanner;

public class Scrabble {
	/**
 	 * Checks to see if a given string containsthe letters to make up
 	 * another given string
 	 *
 	 * @param tiles	the string of characters searched by the method
 	 * @param word  the word that the method searches for the characters of
 	 * @return	whether or not tiles contains the letters to make word
 	 */
	public static boolean canSpell(String tiles, String word) {
		// Converts the strings to lowercase to allow comparison
		word = word.toLowerCase();
		tiles = tiles.toLowerCase();		

		// Initializes count variable, which checks keeps track of
		// similarities
		int count = 0;

		// Loops through the word, looping through the tiles each iteration
		// checking to see if they have coninciding letters
		for (int i = 0; i < word.length(); i++) {
			for (int i2 = 0; i2 < tiles.length(); i2++) {
				if (word.charAt(i) == tiles.charAt(i2)) {
					count += 1;
					tiles = tiles.replaceFirst(String.valueOf(tiles.charAt(i2)), "");
				}
			}
		}

		// Evaluates whether or not it contains the letters and 
		// returns accordingly		
		if (count >= word.length()) return true;
		else return false;
	}

	public static void main(String[] args) {
		System.out.println(canSpell("quuut", "quu"));
		// Initialize instance of Scanner object
		Scanner kbd = new Scanner(System.in);
		
		// Introduces the user to the program
		System.out.println("Welcome to ScrabbleChecker! This program checks to see"
				+ " if a given set of tiles can make up a given word.");
		
		// Prompts the user for a set of tiles
		System.out.print("Enter a set of tiles: ");
		String tiles = kbd.nextLine();

		// Prompts the user for a word
		System.out.println("Enter a word: ");
		String word = kbd.nextLine();
		
		// Checks to see if the word can be spelled and prints accordingly
		if (canSpell(tiles, word)) System.out.printf("The letters \"%s\" can spell \"%s.\"\n", tiles, word);
		else System.out.printf("The letters \"%s\" can not spell \"%s.\"\n", tiles, word);

	}
}
