/**
 * OddRecursion.java
 * @author Ben Durham
 * @version 20171128
 * Uses recursive methods to get the sum of odd numbers
 * I also messed around some with exceptions in this program, as you will see
 */

public class OddRecursion {
    /**
     * Returns the sum of all odd integers between (and including) n and 1
     * 
     * @param   n   The odd number to start from
     * @return      The given odd number + oddSum(n - 2)
     */
    public static int oddSum(int n) throws IllegalArgumentException {
        if (n == 1) {
            // Breaks out of recursion and returns 1 once the loop reaches 1
            return 1;
        } else if (n % 2 == 0) {
            throw new IllegalArgumentException("Number " + n + " must be odd");
        } else {
            // Continues to recur with the next odd number below n
            return n + oddSum(n - 2);
        }
    }
    
    public static void main(String[] args) {
        // Calls oddSum with an integer
        try {
            System.out.println(oddSum(100));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}