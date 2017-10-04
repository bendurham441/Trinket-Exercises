/* * * * * * * * * * * *
 * Fermat.java
 * @author Ben Durham
 * @version 20171003
 * Chapter 4, Exercise 3
 * Checks to see if Fermats theorum with three numbers provided by the user
 */

import java.util.Scanner;

public class Fermat {
	public static void checkFermat(int a, int b, int c, int n) {
		int result = (int) Math.pow(a, n) + (int) Math.pow(b, n);
		
		if (n > 2 && result == Math.pow(c, n)) {
			System.out.println("Holy smokes, Fermat was wrong!");
		} else System.out.println("No, that doesn't work.");
	}

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int a, b, c, n;

		System.out.print("Enter in an \"a\" value: ");
		if (kbd.hasNextInt()) a = kbd.nextInt();
		else System.out.println("Please enter an integer");

		System.out.print("Enter in an \"b\" value: ");
		if (kbd.hasNextInt()) b = kbd.nextInt();
		else System.out.println("Please enter an integer");

		System.out.print("Enter in an \"c\" value: ");
		if (kbd.hasNextInt()) c = kbd.nextInt();
		else System.out.println("Please enter an integer");

		System.out.print("Enter in an \"n\" value: ");
		if (kbd.hasNextInt()) n = kbd.nextInt();
		else System.out.println("Please enter an integer");

		checkFermat(a, b, c, n);
	}
}
