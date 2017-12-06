/**
 * Recurse.java
 * @author Ben Durham
 * @version 20171204
 * Chapter 8 Exercise 7
 */

public class Recurse {
	/** 
	 * Returns the first character of the given String
	 */
	public static char first(String s) {
		return s.charAt(0);
	}

	/**
	 * Returns all but the first letter of the given string
	 */
	public static String rest(String s) {
		return s.substring(1);
	}

	/**
	 * Returns all but the first and last letter of the String.
	 */
	public static String middle(String s) {
		return s.substring(1, s.length() - 1);
	}

	/**
	 * Returns the length of the given String
	 */
	public static int length(String s) {
		return s.length();
	}

	public static void printString(String s, int len) {
		if (len == 1) System.out.println(first(s));
		else {
			System.out.println(first(s));
			printString(rest(s), len - 1);
		}
	}
	
	/**
	 * I know that this does not work, but I am struggling to conceptualize how I could write this recursively
	 * The same goes for the reverseString method
	 *
	 */
	public static void printBackward(String s, int len) {
		if (len == 1) System.out.println(first(s));
		else {
			printString(rest(s), len - 1);
			System.out.println(first(s));
		}
	}

	public static void main(String[] args) {
		String test = "testing";
		System.out.printf("The first letter of %s is %s.\n", test, first(test));
		System.out.printf("The rest of %s is %s.\n", test, rest(test));
		System.out.printf("All the letters of %s excluding the first "
				+ "and last are %s.\n", test, middle(test));
		System.out.printf("The length of %s is %d.\n", test, length(test));
		printBackward(test, length(test));
	}
}
