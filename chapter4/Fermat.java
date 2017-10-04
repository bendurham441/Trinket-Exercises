/* * * * * * * * * * * *
 * Fermat.java
 * @author Ben Durham
 * @version 20171003
 * Chapter 4, Exercise 3
 * Checks to see if Fermats theorum with three numbers provided by the user
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Fermat {

	// Method to calculate whether fermats theory works on three given numbers and their exponents.
	public static void checkFermat(int a, int b, int c, int n) {
		int result = (int) Math.pow(a, n) + (int) Math.pow(b, n);
		
		if (n > 2 && result == Math.pow(c, n)) {
			System.out.println("Holy smokes, Fermat was wrong!");
		} else System.out.println("No, that doesn't work.");
	}

	public static void main(String[] args) {

		// Opens a new scanner and initializes variables needed to recieve scanner input
		Scanner kbd = new Scanner(System.in);
		int a, b, c, n;
	
		// Get a value	
		System.out.print("Enter an \"a\" value: ");
		
		while (true) {
			try {
				// Given the correct input, assigns variable and breaks from loop
				a = kbd.nextInt();
				break;
			} catch (InputMismatchException e) {
				// Catches the exception and loops back
				System.out.print("Invalid input. Please re enter: ");
				kbd.nextLine();
			}
		}

		// Get b value
		System.out.print("Enter an \"b\" value: ");
		
		while (true) {
			try {
				// Given the correct input, assigns variable and breaks from loop
				b = kbd.nextInt();
				break;
			} catch (InputMismatchException e) {
				// Catches the exception and loops back
				System.out.print("Invalid input. Please re enter: ");
				kbd.nextLine();
			}
		}
		
		// Get c value
		System.out.print("Enter an \"c\" value: ");
		
		while (true) {
			try {
				// Given the correct input, assigns variable and breaks from loop
				c = kbd.nextInt();
				break;
			} catch (InputMismatchException e) {
				// Catches the exception and loops back
				System.out.print("Invalid input. Please re enter: ");
				kbd.nextLine();
			}
		}

		// Get n value
		System.out.print("Enter an \"n\" value: ");
		
		while (true) {
			try {
				// Given the correct input, assigns variable and breaks from loop
				n = kbd.nextInt();
				break;
			} catch (InputMismatchException e) {
				// Catches the exception and loops back
				System.out.print("Invalid input. Please re enter: ");
				kbd.nextLine();
			}
		}

		checkFermat(a, b, c, n);
	}
}
