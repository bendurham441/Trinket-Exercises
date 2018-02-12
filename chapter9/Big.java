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
		BigInteger bigFactorial = factorial(999999);
		System.out.println(bigFactorial);
		System.out.println(bigFactorial.toString().length());
	}
}
