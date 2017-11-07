/**
 * FactorChecker.java
 * @author Ben Durham
 * @version 20171107
 * Chapter 7 Exercise 5
 */

import java.util.Scanner;

public class FactorChecker {
	/**
	 * Checks to see if the elements of a given array are factors of a
	 * given number
	 *
	 * @param n	the number to check whether other are factors of it
	 * @param arr	the array of elements to be checked
	 * @return	whether or not the elements of the array are factors
	 * 		of n
	 */
	public static boolean areFactors(int n, int[] arr) {
		for (int num : arr) {
			if (n % num != 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// Create a new Scanner
		Scanner kbd = new Scanner(System.in);

		// Introduce the program
		System.out.println("Welcome to FactorChecker.java.");

		// Prompts the user for a number to check whether or not
		// the given numbers are factors of
		System.out.print("Enter a number: ");
		int num = kbd.nextInt();

		// Asks the user how many number to check
		System.out.print("How many number would you like to check: ");
		int[] factors = new int[kbd.nextInt()];

		// Populates the factor array
		for (int i = 0; i < factors.length; i++) {
			System.out.print("Enter a number: ");
			factors[i] = kbd.nextInt();
		}

		// Returns the result
		if (areFactors(num, factors)) {
			System.out.printf("The given numbers are all "
					+ "factors of %d.\n", num);
		} else {
			System.out.printf("the given numbers are not all "
					+ "factors of %d.\n", num);
		}

	}
}
