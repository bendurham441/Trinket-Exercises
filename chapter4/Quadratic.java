/* * * * * * * * *
 * Quadratic.java
 * @author Ben Durham
 * @version 20171003
 * A program that calculates the quadratic formula
 */

import java.util.Scanner;
import java.util.InputMismatchException;


public class Quadratic {
	public static void formula(double a, double b, double c) {

		double answer1, answer2;
		if (Math.pow(b, 2) - 4 * a * c >= 0) {
			// Calculates the quadratic formula when the descriminant is positive
			answer1 = (-1 * b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
			answer2 = (-1 * b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
			double[] answers = {answer1, answer2};
			System.out.printf("x = %.2f, %.2f\n", answers[0], answers[1]);
		} else {
			// Prints the result, managing imaginary numbers
			System.out.printf("x = %.2f +- (%.2fi) / %.2f\n", -1 * b / a, Math.abs(Math.pow(b, 2) - 4 * a * c), 2 * a);	// +- means plus or minus
			System.out.println("+- means plus or minus");
		}
	}
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		double a, b, c;

		System.out.println("Welcome to Quadratic solver!");
		
		// Gets an a value
		System.out.print("Input a value for \"a\": ");
		
		while (true) {
			try {	
				// If it recieves the correct input, it assigns the variable and breaks out of the loop
				a = kbd.nextDouble();
				break;
			} catch (InputMismatchException e) {
				// Given an invalid input, it catches the exception and tries again
				System.out.println("Please enter a number: ");
				kbd.nextLine();
			}
		}

		// Gets a b value
		System.out.print("Input a value for \"b\": ");
		
		while (true) {
			try {	
				// If it recieves the correct input, it assigns the variable and breaks out of the loop
				b = kbd.nextDouble();
				break;
			} catch (InputMismatchException e) {
				// Given an invalid input, it catches the exception and tries again
				System.out.println("Please enter a number: ");
				kbd.nextLine();
			}
		}
		
		// Gets a c value
		System.out.print("Input a value for \"c\": ");
		
		while (true) {
			try {	
				// If it recieves the correct input, it assigns the variable and breaks out of the loop
				c = kbd.nextDouble();
				break;
			} catch (InputMismatchException e) {
				// Given an invalid input, it catches the exception and tries again
				System.out.println("Please enter a number: ");
				kbd.nextLine();
			}
		}

		formula(a, b, c);
	}
}
