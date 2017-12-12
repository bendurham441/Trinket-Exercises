/**
 * EulerApprox.java
 * @author Ben Durham
 * @version 20171211
 * Chapter 9 Exercise 5
 * Approximates e^x
 */

public class EulerApprox {
    /**
     * Returns the factorial of a given number
     * 
     * @param x     the number to get the factorial of
     * @return      the factorial of x
     */
    public static int factorial(int x) {
        if (x == 1) return 1;
        return x * factorial(x - 1);
    }
    /**
     * Using an infinite series, estimates the value of e^x using n terms
     * 
     * @param x     the number to raise e to
     * @param n     the number of terms in the series to use
     * @return      the estimate using the infinite series
     */
    public static double myExp(double x, int n) {
        // Variables to store the previous values ot eliminate the need to use
        // Math.pow() and factorial
        double num = 1;
        double den = 1;
        // The running sum
        double total = 1;
        // Calculates the series to n terms
        for (int i = 1; i < n; i++) {
            num *= x;
            den *= i;
            total += num / den;
        }
        // Returns the result
        return total;
    }
    
    /**
     * A recursive definition of the infinite series problem (for good measure)
     * 
     * @param x     The number to raise e to
     * @param n     The number of terms to take the series out to
     * @return      The result found by using the infinite series to n terms.
     *              This is an estimation of e^x
     * @see         factorial
     */
    public static double myExpRecurse(int x, int n) {
        if (n == 1) return 1;
        else return Math.pow(x, n - 1) / factorial(n - 1) + myExpRecurse(x, n - 1);
    }
    
    /**
     * Compares the values of myExp to the result of Math.exp. This method 
     * prints out the result
     * 
     * @param x     the number to raise e to
     * @see         myExp
     */
    public static void check(double x) {
        System.out.printf("%2f\t%.10f\t%.10f\n", x, myExp(x, 15), Math.exp(x));
    }
    
    public static void main(String[] args) {
        // The larger the value, the less accurate the answer
        // Negative values bring down the accuracy very quickly
        double[] values = {0.1, 1.0, 10.0, 100.0, -0.1, -1.0, -10.0, -100.0};
        for (int i = 0; i < values.length; i++) {
            check(values[i]);
        }
    }
}