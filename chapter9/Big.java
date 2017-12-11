/**
 * Big.java
 * @author Ben Durham
 * @version 20171210
 * Chapter 9 Exercise 3
 * Making a factorial method using BigInteger
 */

import java.math.BigInteger;

public class Big {
	public static BigInteger factorial(int n) {
		BigInteger total = BigInteger.valueOf(1);
		for (int i = n; i > 0; i--) {
			total = total.multiply(BigInteger.valueOf(i));
		}
		return total;
	}

	public static void main(String[] args) {
		System.out.println(factorial(4));

		for (int i = 0; i < 9999; i++) {
			System.out.printf("%d: %10d\n", i, factorial(i));
		}
	}
}
