/**
 * BigIntExp.java
 * @author Ben Durham
 * @version 20171211
 * Chapter 9 Exercise 4
 * Improves power method to use BigInteger as output
 */

import java.math.BigInteger;

public class BigIntExp {
    
    public static BigInteger pow(int x, int n) {
        if (n == 0) return BigInteger.valueOf(1);
        BigInteger t = pow(x, n / 2);
        
        if (n % 2 == 0) return t.multiply(t);
        else {
            t = t.multiply(t);
            return t.multiply(BigInteger.valueOf(x));
        }
    }
    
    public static void main(String[] args) {
            System.out.println(pow(99, 99));
    }

}