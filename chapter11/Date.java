/**
 * Data.java
 * @author Ben Durham
 * @version 20180203
 * Chapter 11, Exercise 4
 * A date class
 */

public class Date {
	private int year;
	private int month;
	private int day;
	
	public Date() {
		this.year = 0;
		this.month = 1;
		this.day = 1;
	}
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public static void main(String[] args) {
		Date birthday = new Date(2001, 10, 22);
	}
}
