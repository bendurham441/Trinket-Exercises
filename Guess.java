/* Guess.java
 * Ben Durham
 * AP CS A
 *
 * A game to make the user guess a random number generated by the computer.
 */

import java.util.Scanner;
import java.util.Random;

public class Guess {
	final static int MAX = 100;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Random gen = new Random();

		int num = gen.nextInt(100);
		
		System.out.printf("I'm thinking of a number between 0 and %d (inclusive). Can you guess what it is?\n", MAX);
		System.out.print("Type your guess: ");
		int guess = in.nextInt();

		System.out.printf("The number I was thinking of was %d.\n", num);

		if (guess > num) {
			System.out.printf("You were %d over.\n", guess - num);
		} else if (num > guess) {
			System.out.printf("You were %d under.\n", num - guess);
		} else {
			System.out.println("You guessed it! Congratulations");
		}
		
	}
}
