/* * * * * * * * * * * * *
 * Triangle.java
 * @author Ben Durham
 * @version 20171004
 * Finds if given side lengths can make up a triangle
 * Chapter 4, Exercise 6
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Triangle {

	// Checks to see if a triangle with a, b, and c sidelengths would be a triangle
	public static boolean check(int a, int b, int c) {
		if (a > b + c || b > a + c || c > a + b) return false;
		else return true;
	}

	public static void main(String[] args) {

		// Creates a scanner and initializes variables to hold side lengths
		Scanner kbd = new Scanner(System.in);
		int side1, side2, side3;
		
		// Welcomes the user to the program and specifies what it does
		System.out.println("Welcome to Triangle Checker! This program checks to see if any given side lengths can make up a triangle.");
		
		// Gets the value for a
		System.out.print("Enter one side length: ");
		while (true) {
			try {
				// When given correct input, stores the value and breaks from the loop
				side1 = kbd.nextInt();
				break;
			}
			catch (InputMismatchException e) {
				// When given incorrect input, prompt the user again
				System.out.println("Invalid input. Please enter an integer: ");
				kbd.nextLine();
			}
		}
		
		// Gets the value for b
		System.out.print("Enter another side length: ");
		while (true) {
			try {
				side2 = kbd.nextInt();
				break;
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter an integer: ");
				kbd.nextLine();
			}
		}
		
		// Gets the value for c
		System.out.print("Enter the last side length: ");
		while (true) {
			try {
				side3 = kbd.nextInt();
				break;
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter an integer: ");
				kbd.nextLine();
			}
		}
		
		// Stores whether or not the sides make a triangle
		boolean isTriangle = check(side1, side2, side3);

		// Prints the outcome
		if (isTriangle) {
			System.out.printf("The side lengths %d, %d, and %d make up a triangle.\n", side1, side2, side3);
		} else {
			System.out.printf("The side lengths %d, %d, and %d do not make up a triangle.\n", side1, side2, side3);
		}
		
		// Closes the Scanner
		kbd.close();
	}
}
