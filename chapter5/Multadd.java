/**
 * MultAdd.java 
 * @author Ben Durham
 * @version 20171016
 * A program to demonstrate the use of the MultAdd function
 */
public class Multadd {
    
    /**
     * Evaluates the expression a * b + c to simplify some mathematical 
     * expressions
     * 
     * @param a the value a in the expression a * b + c
     * @param b the value b in the expression a * b + c
     * @param c the value c in the expression a * b + c
     * @return  the value of a * b + c 
     */
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }
    
    /**
     * Evaluates the provided expression
     * 
     * @param   a the variable x in the equation
     * @returns the value of the expression
     */
    public static double expSum(double a) {
        double num1 = Math.exp(-1 * a);
        double num2 = Math.sqrt(1 - Math.exp(-1 * a));
    
        return multadd(a, num1, num2);
    }
    
    public static void main(String[] args) {
        
        // 
        System.out.println(multadd(1, 2, 3));
        
        double val1 = Math.cos(Math.PI / 4.0);
        double val2 = 1.0 / 2.0;
        double val3 = Math.cos(Math.PI / 4.0);
        
        System.out.println(multadd(val1, val2, val3));
        
        System.out.println(expSum(10));
    }
}
