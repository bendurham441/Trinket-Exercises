/**
 * Ackerman.java
 * @author Ben Durham
 * @version 20171128
 * Demonstrates the Ackerman function as a recursively defined method in java
 * Chapter 8 Exercise 4
 */

public class Ackerman {
    /**
     * The Ackerman Function
     * 
     * @param m     an integer
     * @param n     an integer
     * @return      the output of the Ackerman function
     */
    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        } else {
            n = ack(m, n - 1);
            return ack(m - 1, n);
        }
    }
    
    public static void main(String[] args) {
        // Prints out A(3, 3)
        System.out.println(ack(3, 3));
    }
}