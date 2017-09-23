/* * * * * * * * * *
 * Printest.java
 * @author Ben Durham
 * @version 20170923
 * Testing potential errors with printf.
 * Chapter 3, Exercise 1
 */

public class PrintTest {
	public static void main(String[] args) {
		int integer = 10;
		String string = "test";
		double decimal = 1.5;
		
		System.out.printf("displaying an int through %%f: %f\n", integer);
		System.out.printf("displaying a double through %%d: %d\n", decimal);
		System.out.printf("two %%fs with one argument %f %f\n", string);

		// I got the error java.util.IllegalFormatConversionException
	}
}
