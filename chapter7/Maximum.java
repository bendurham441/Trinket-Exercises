/**
 * Maximum.java
 * @author Ben Durham
 * @version 20171107
 * Chapter 7, Exercise 3
 */

import java.util.Scanner;

public class Maximum {
	/**
	 * Returns the index of the largest number in an array of integers
	 *
	 * @param  arr the array to check
	 * @return     the index of the largest number
	 *
	 */
	public static int indexOfMax(int[] arr) {
		// Creates a variable to hold the maximum
		int max = 0;

		// Iterates through the array to see if any values are greater
		// than the current max
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[max]) max = i;
		}

		// Returns the maximum value
		return max;
	}

	public static void main(String[] args) {
		// Creates a new instance of the Scanner object
		Scanner kbd = new Scanner(System.in);
		
		// Introduces the user to the program
		System.out.println("Welcome to Maximum.java! This program "
				+ "returns the index of the maximum number "
				+ "in a given array.");

		// Prompts the user for how many numbers they want to check
		System.out.print("How many numbers: ");
		int[] input = new int[kbd.nextInt()];

		// Populates the array
		for (int i = 0; i < input.length; i++) {
			System.out.print("Enter a number: ");
			input[i] = kbd.nextInt();
		}

		// Prints the result
		System.out.printf("%d is the index of the maximum number.\n",
				indexOfMax(input));
	}
}
