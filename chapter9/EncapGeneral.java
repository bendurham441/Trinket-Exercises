/**
 * EncapGeneral.java
 * @author Ben Durham
 * @version 20171210
 * Chapter 9 Exercise 2
 * Practicing encapsulation and generalization
 */

public class EncapGeneral {
	public static double[] powArray(double[] arr, int pow) {
		double[] output = new double[arr.length];
		for (int i = 0; i < arr.length; i++) {
			output[i] = Math.pow(arr[i], pow);
		}
		return output;
	}
	
	public static int[] histogram(int[] arr, int counters) {
		int[] histogram = new int[counters];
		for (int i = 0; i < arr.length; i++) {
			histogram[arr[i]]++;
		}
		return histogram;
	}
	
	public static void main(String[] args) {
		// To test powArray()
		double[] test = {1, 2, 3};
		test = powArray(test, 2);
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
		
		// To test histogram()
		int[] scores = {1, 2, 99};
		int[] histo = histogram(scores, 100);
		for (int i = 0; i < histo.length; i++) {
			System.out.println(histo[i]);
		}

	}
}
