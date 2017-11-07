/**
 * Maximun.java
 * @author Ben Durham
 * @version 20171107
 * Chapter 7, Exercise 3
 */

public class Maximum {
	/**
	 * Returns the index of the largest number in an array of integers
	 *
	 * @param  arr the array to check
	 * @return     the index of the largest number
	 *
	 */
	public static int indexOfMax(int[] arr) {
		// Creates a variable to hold the maximum
		int max = 0;

		// Iterates through the array to see if any values are greater
		// than the current max
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[max]) max = i;
		}

		// Returns the maximum value
		return max;
	}

	public static void main(String[] args) {

		int[] test = {10, 3, 5, 6};

		System.out.println(indexOfMax(test));
		
	}
}
