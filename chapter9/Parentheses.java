/**
 * Parentheses.java
 * @author Ben Durham
 * @version 20171212
 * Chapter 9 Exercise 6
 * Parentheses check
 */

public class Parentheses {
	/**
	 * Checks to see if a string contains an equal amount of closing and
	 * opening parentheses
	 *
	 * @param str	the string to check
	 * @return	How many more opening or closing parentheses there are
	 */
	public static int parenCheck(String str) {
		// Variable to count inequality
		int count = 0;
		// Increments when an opening is found, decrements when a
		// closing is found
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(') count++;
			else if (c == ')') count--;
		}
		// Returns the value of how many more closing or opening
		// parentheses there are
		return count;
	}
	
	public static void main(String[] args) {
		String[] strings = {"(test", "test)", "(()", "()()"};
		for (int i = 0; i < strings.length; i++) {
			System.out.printf("%s: %d\n", strings[i],
						parenCheck(strings[i]));
		}
	}
}
