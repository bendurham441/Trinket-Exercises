/**
 * Date.java
 * @author Ben Durham
 * @version 20171016
 * Rewrite of the Data.java exercise using methods
 */
public class Date {

	// Prints the date in American Format
	public static void printAmerican(String day, String month, int date, int year) {
		System.out.println(day + ", " + month + " " + date + ", " + year);
	}

	// Prnts the date in European format
	public static void printEuropean(String day, String month, int date, int year) {
		System.out.println(day + " " + date + " " + month + " " + year);
	}
	
	public static void main (String[] args) {
		String day = "Saturday";
		String month = "September";
		int date = 16;
		int year = 2017;
	
		System.out.println("American format:");
		printAmerican(day, month, date, year);
		System.out.println("European format:");
		printEuropean(day, month, date, year);

	}
}
