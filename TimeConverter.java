/* * * * * * * * *
 * TimeConverter.java
 * @author Ben Durham
 * @version 20170923
 * Converts an inputted number of seconds to that same amount of time in hours, minutes and seconds
 * Chapter 3, Exercise 3
 */

import java.util.Scanner;

public class TimeConverter {

	public static final int MINS_PER_HOUR = 60;
	public static final int SECS_PER_MIN = 60;

	public static int[] secsToHMS(int s) {
		// Declares and assigns an array with the H:M:S values from the parameter "s"
		int hms[] = new int[3];				
		hms[0] = s / (MINS_PER_HOUR * SECS_PER_MIN);
		hms[1] = s % (MINS_PER_HOUR * SECS_PER_MIN) / SECS_PER_MIN;
		hms[2] = s % (MINS_PER_HOUR * SECS_PER_MIN) % SECS_PER_MIN;
		return hms;
	}

	public static void main(String[] args) {
		// Initiates a Scanner and prompts user to be converted
		Scanner in = new Scanner(System.in);	
		System.out.print("Enter the number of seconds you would like to convert to hms -> ");
		int seconds = in.nextInt();
	
		// Converts the inputted number to HMS format
		int hms[] = secsToHMS(seconds);

		// Outputs the converted in H:M:S format
		System.out.printf("Hours: %d\n", hms[0]);
		System.out.printf("Minutes: %d\n", hms[1]);
		System.out.printf("Seconds: %d\n", hms[2]);
		
	}
}
