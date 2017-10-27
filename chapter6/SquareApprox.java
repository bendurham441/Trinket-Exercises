/**
 * SquareApprox.java
 * @author Ben Durham
 * @version 20171025
 * Using loops to approximate square root
 */

import java.util.Scanner;

public class SquareApprox {
	/**
	 * This method uses loops to approximate the square root of 
	 * a given number
	 *
 	 * @param  n a number to approximate the square root of
 	 * @return   an approximate square root
 	 */  
	public static double squareRoot(double n) {
		
		// initializing two estimate variables to be compared through iteration
		double est0 = n / 2.0;
		double est1 = (est0 + n / est0) / 2;

		// continues to guess until it gets to 10,000th place decimal precisin
		while (Math.abs(est1 - est0) >= 0.0001) {
			est0 = (est1 + n / est1) / 2;
			est1 = (est0 + n / est0) / 2;
		}

		return est1;
	}
	
	public static void main(String[] args) {
		// creates the a scanner object
		Scanner kbd = new Scanner(System.in);
		
		// Prompts the user for a number and stores it in input
		System.out.print("Enter a integer: ");
		int input = kbd.nextInt();

		// Closes the Scanner
		kbd.close();

		// Prints the result
		System.out.printf("The square root of %d is approximately %f.\n", input, squareRoot(input));
	}
}
