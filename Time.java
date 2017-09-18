/* Time.java
 * Ben Durham, AP Comp Sci A
 * Chapter 2, Exercise 3
 */

public class Time {
	public static final HOURS_PER_DAY = 24;
	public static final MINS_PER_HOUR = 60;
	public static final SECS_PER_MIN = 60;
	
	public static int hmsToSecs(int h, int m, int s) {	// converts hours minutes seconds to seconds
		int seconds = (h * MINS_PER_HOUR * SECS_PER_MINUTE) + (m * SECS_PER_MINUTE) + s;
		return seconds;
	}

	public static int[] secsToHms(int s) {			// converts seconds to hours minutes and seconds
		int time[] = new int[3];	
		time[0]  = s / (60 * 60);
		time[1] = s % (60 * 60) / 60;
		time[2] = (s % (60 * 60) % 60);
		return time;
	}

	public static int[] timeElapsed(int[] start, int[] end) {		// finds the difference between two times
		int start_seconds = hmsToSecs(start[0], start[1], start[2]);
		int end_seconds = hmsToSecs(end[0], end[1], end[2]);
		int elapsed = end_seconds - start_seconds;
		int[] elapsed_hms = secsToHms(elapsed);
		return elapsed_hms;
	}

	public static void main(String[] args) {
		int hour = 16;								// time at the beginning of this exercise
		int min = 40;
		int sec = 15;
		int[] past_time = new int[] {hour, min, sec};

		int since_midnight = hmsToSecs(hour, min, sec);				// the number of seconds since midnight
		int seconds_left = (HOURS_PER_DAY * MINS_PER_HOUR * SECS_PER_MIN) - since_midnight;			// the number of seconds left in the day	
		double percent_day = (double) since_midnight / (HOURS_PER_DAY * MINS_PER_DAY * SECS_PER_MIN) * 100;
		
		System.out.println("Seconds since midnight: " + since_midnight);
		System.out.println("Seconds left in day: " + seconds_left);
		System.out.println("Percent of day past: " + percent_day + "%");

		int cur_hour = 16;							// time at the end of this exercise
		int cur_min = 48;
		int cur_sec = 45;
		int[] cur_time = new int[] {cur_hour, cur_min, cur_sec};

		int[] elapsed = timeElapsed(past_time, cur_time);
		
		System.out.println("Time elapsed since exercise started: " + elapsed[0] + ":" + elapsed[1] + ":" + elapsed[2]);

	}
}
