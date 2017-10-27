/**
 * GuassApprox.java
 * @author Ben Durham
 * @version 20171025
 * Estimates the value of e^(-x^2) using loops
 */

import java.util.Scanner;

public class GaussApprox {
	/**
 	 * A function to return the factorial of a given number
 	 *
 	 * @param  x the number which is factorial'd
 	 * @return   the factorial of x
 	 */ 
	public static int factorial(int x) {
		int result = 1;
		
		for (int i = x; i  > 0; i--) {
			result *= i;
		}

		return result;
	}
	
	/**
 	 * A function to return an approximation of e^(-x^2) using an infinite
 	 * series
 	 *
 	 * @param x the x valueof the previous equation
 	 * @param n the number of terms to calculate
 	 * @return  the approximation of the previous equation using x
 	 */
	public static double gauss(int x, int n) {
		double estimate = 1;
		for (int i = 1; i <= n; i++) {
			estimate += Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial(i);
		}
		return estimate;
		
	}
	
	public static void main(String[] args) {
		// Creates a new Scanner object
		Scanner kbd = new Scanner(System.in);
		
		// Initialize the necessary variables
		int x, n;

		// Introduce the program
		System.out.println("Welcome to GaussApprox. This program "
			+ "uses an infinite series to approximate the value "
			+ "of e^(-x^2).");

		// Prompts the user for a value for x
		System.out.print("Enter a number for x: ");
		x = kbd.nextInt();
		
		// Prompts the user for a value for n
		System.out.print("Enter how many terms in the series you want "
			+ "to be calculated: ");
		n = kbd.nextInt();

		// Close scanner
		kbd.close();

		// Prints the result
		System.out.printf("e^(-%d^2) is approximately %f.\n", x, gauss(x, n));
	}
}
