/* * * * * * * * * * * * * *
 * CurrencyConverter.java
 * @author Ben Durham
 * @version 20170923
 * Chapter 3
 * Converts from euros to dollars or vice versa
 */

public class CurrencyConverter {

	public static double USD_TO_EURO_RATE = 0.836806; 

	public static double euroToUSD(double euro) {
		// Reverses the exchange rate and applies it to the parameter euro
		double rate = 1 / USD_TO_EURO_RATE;
		return euro * rate;
	}

	public static double USDToEuro(double USD) {
		return USD * USD_TO_EURO_RATE;
	}

	public static void main(String[] args) {
		double dollars = euroToUSD(1.0);
		double euros = USDToEuro(1.0);
		
		System.out.printf("One Euro is equal to %.2f dollars.\n", dollars);
		System.out.printf("One USD is equal to %.2f Euros.\n", euros);
	}
}
