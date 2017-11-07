/**
 * SeiveOfE.java
 * @author Ben Durham
 * @version 20171107
 * Chapter 7, Exercise 4
 */

import java.util.Scanner;

public class SeiveOfE {
	/**
 	 * Given a number, returns an array containing whether or not the
 	 * numbers below it are prime numbers
 	 *
 	 * @param  n	a number to check for primes below
 	 * @return   	an array of booleans representing whether or not 
 	 * 		that index is prime
 	 */
	public static boolean[] seive(int n) {
		// Creates a new array to hold booleans for all numbers
		// from 0 to n - 1
		boolean[] result = new boolean[n];
	
		// Sets all booleans to true to start
		for (int i = 0; i < result.length; i++) {
			result[i] = true;
		}

		// Checks if numbers represented by indicies are divisible
		// by numbers below the square root of n
		for (int i = 2; i < Math.sqrt(n); i++) {
			for (int i2 = 0; i2 < result.length; i2++) {
				// If it is not prime, change the boolean
				// at that index to false
				if (i2 % i == 0 && i2 != i) result[i2] = false;
			}	
		}

		// Returns the boolean array
		return result;
	}
	
	/**
 	 * Prints out an array that has been run through the seive
 	 *
 	 * @param arr 	an array that has been run through the seive
 	 */
	public static void printSeiveArray(boolean[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + ": ");
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// Creates a new instance of the Scanner object
		Scanner kbd = new Scanner(System.in);
		
		// Introduces the program
		System.out.println("Welcome to SeiveOfE.java, a program which"
				+ " emulates the seive of Eratosthenes.");

		// Prompts the user for a number and runs it through the seive
		System.out.print("Enter a number that you would like to run"
				+ "through the seive: ");	
		boolean[] results = seive(kbd.nextInt());

		// Prints the result
		printSeiveArray(results);
	}
	
}
