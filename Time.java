

public class Time {

	public static int hmsToSecs(int h, int m, int s) {	// converts hours minutes seconds to seconds
		int seconds = (h * 60 * 60) + (m * 60) + s;
		return seconds;
	}

	public static int[] secsToHms(int s) {			// converts seconds to hours minutes and seconds
		int time[] = new int[3];	
		time[0]  = s / (60 * 60);
		time[1] = s % (60 * 60) / 60;
		time[2] = (s % (60 * 60) % 60);
		return time;
	}

	public static int[] timeElapsed(int[] start, int[] end) {
		int start_seconds = hmsToS(start[0], start[1], start[2]);
		int end_seconds = hmsToS(end[0], end[1], end[2]);
		int elapsed = end_seconds - start_seconds;
		int[] elapsed_hms = secsToHms(elapsed);
		return elapsed_hms;
	}

	public static void main(String[] args) {
		int hour = 16;								// time at the beginning of this exercise
		int min = 40;
		int sec = 15;

		int since_midnight = hmsToSecs(hour, min, sec);				// the number of seconds since midnight
		int seconds_left = (24 * 60 * 60) - since_midnight;			// the number of seconds left in the day	
		double percent_day = (double) since_midnight / (24 * 60 * 60) * 100;
		
		System.out.println("Seconds since midnight: " + since_midnight);
		System.out.println("Seconds left in day: " + seconds_left);
		System.out.println("Percent of day past: " + percent_day + "%");

		int cur_hour = 16;							// time at the end of this exercise
		int cur_min = 48;
		int cur_sec = 45;

		int cur_seconds = hmsToSecs(cur_hour, cur_min, cur_sec);
		int elapsed = cur_seconds - since_midnight;				// the time elapesd since the beginning of this exercise
		
		int[] elapsed_hms = secsToHms(elapsed);

		int[] elapsed = timeElapsed([hour, min, sec],  [cur_hour, cur_min, cur_sec]);
		
		System.out.println("Time elapsed since exercise started: " + elapsed_hms[0] + ":" + elapsed_hms[1] + ":" + elapsed_hms[2]);

	}
}
