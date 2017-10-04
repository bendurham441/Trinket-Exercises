/* * * * * * * * * * * * * * * *
 * Evaluation.java
 * @author Ben Durham
 * @version 20171003
 * Chapter 4, exercise 1
 */

public class Evaluation {
	public static void main(String[] args) {
		boolean yes = true;
		boolean no = false;
		int loVal = -999;
		int hiVal = 999;
		double grade = 87.5;
		double amount = 50.0;
		String hello = "world";

		System.out.println(yes == no || grade > amount); 	// prints true
		// System.out.println(amount == 40.0 || 50);  		// error
		System.out.println(hiVal != loVal || loVal < 0); 	// prints true
		// System.out.println(True || hello.length() > 0); 	// error
		System.out.println(hello.isEmpty() && yes);		// prints false
		System.out.println(grade <= 100 && !false);		// prints true
		System.out.println(!yes || no);				// prints false
		// System.out.println(grade > 75 > amount); 		// error
		System.out.println(amount <= hiVal && amount >= loVal); // prints true
		System.out.println(no && !no || yes && !yes);		// prints false
	}
}
