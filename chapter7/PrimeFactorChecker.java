/**
 * PrimeFactorChecker.java
 * @author Ben Durham
 * @version 20171107
 * Chapter 7, Exercise 6
 */

import java.util.Scanner;

public class PrimeFactorChecker {
	/**
	 * Checks to see if a given number is prime
	 *
	 * @param n	the number to check
	 * @return	whether or not the number is prime
	 */ 
	public static boolean isPrime(int n) {
		// Checks to see if numbers less than half of n can divide
		// into n
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
	
	/**
	 * Checks to see if the elements of a given array are prime factors of
	 * a given number
	 *
	 * @param n	the number to check whether other numbers divide into
	 * 		it
	 * @param arr 	the array of numbers to check
	 * @return	whether or not all the numbers in arr are prime factors
	 * 		of n
	 * @see isPrime
	 */
	public static boolean arePrimeFactors(int n, int[] arr) {
		// Checks if the numbers in the array are not factors or not
		// prime
		for (int num : arr) {
			if (n % num != 0 || !isPrime(num)) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// Creates a new instance of the Scanner object
		Scanner kbd = new Scanner(System.in);
		
		// Introduces the user to the program
		System.out.println("Welcome to PrimeFactorChecker.java!");
		
		// Prompts the user for a number
		System.out.print("Enter a number: ");
		int num = kbd.nextInt();

		// Prompts the user how many factors they would like to check
		System.out.print("How many factors would you like to check: ");
		int[] factors = new int[kbd.nextInt()];

		// Populates an array of potential factors
		for (int i = 0; i < factors.length; i++) {
			System.out.print("Enter a potential prime factor: ");
			factors[i] = kbd.nextInt();
		}

		// Checks to see if the numbers are prime factors and prints
		// the result
		if (arePrimeFactors(num, factors)) {
			System.out.printf("The given numbers are all prime "
					+ "factors of %d.\n", num);
		} else {
			System.out.printf("The given numbers are not all "
					+ "prime factors of %d.\n", num);
		}
	}
}
