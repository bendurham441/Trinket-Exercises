/************************
 * Converter.java
 * @author Ben Durham
 * @version 20170920
 * Asks for Celcius and converts to Fahrenheit
 */

import java.util.Scanner;

public class Converter {
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("This program converts Celcius to Fahrenheit.");
        System.out.print("Enter the degree amount you would like to convert: ");
        double cels = input.nextDouble();
        double fahr = cels * 9 / 5 + 32;
        System.out.printf("%.1f degrees celsius is equal to %.1f degrees fahrenheit.\n", cels, fahr);
        
        input.close();
    }
    
}