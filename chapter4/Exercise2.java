/* * * * * * * * * * * *
 * Exercise2.java
 * @author Ben Durham
 * @version 20171003
 * Chapter 4, Exercise 2
 */

public class Exercise2 {
	public static void method(int x) {
		if (x > 0 && x < 10) {
			System.out.println("positive single digit number");
		}
	}
	public static void main(String[] args) {
		method(1);
		method(5);
		method(11);
		method(-1);
	}
}
