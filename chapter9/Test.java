/**
 * Test.java
 * @author Ben Durham
 * @version 20171210
 * Chapter 9 Exercise 1
 * Testing different types of concatenation. The table described in the
 * exercise is in my notebook.
 */

public class Test {
	public static void main(String[] args) {
		int integer = 0;
		boolean bool = true;
		char character = 'a';
		double decimal = 1.2;
		String str = "test";
/*
		System.out.println(bool + bool);
		System.out.println(bool + integer);
		System.out.println(bool + character);
		System.out.println(bool + decimal);
		System.out.println(bool + str);

		System.out.println(character + character);
		System.out.println(character + integer);
		System.out.println(character + decimal);
		System.out.println(character + str);
*/
		System.out.println(integer + decimal);
		System.out.println(integer + str);
		System.out.println(integer + character);

		System.out.println(decimal + str);

		System.out.println(character++);
		System.out.println(character + 1);

		System.out.println(integer + "");
		System.out.println(bool + "");
		System.out.println(character + "");
		System.out.println(decimal + "");
	}
}
