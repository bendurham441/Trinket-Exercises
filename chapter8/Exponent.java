/**
 * Exponent.java
 * @author Ben Durham
 * @version 20171128
 * Recursively calculates exponents
 */

public class Exponent {
    /**
     * Recursively calculates exponents
     * 
     * @param x     an integer to be raised to a power
     * @param n     the power to raise x to
     * @return      the result of x to the n
     */
    public static int power(int x, int n) {
        if (n == 1) {
            // Once x^1 is reached, returns x and breaks recursion
            return x;
        } else {
            // Recurring multiplication of x n times
            return x * power(x, n - 1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(power(367, 3));
    }
}