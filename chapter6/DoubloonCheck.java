/**
 * DoubloonCheck.java 
 * @author Ben Durham
 * @version 20171026
 * Checks to see if a given string is a doubloon
 * Chapter 6, Exercise 5
 */
 
 import java.util.Scanner;
 
public class DoubloonCheck {
  /**
   * Checks to see if the word is a doubloon by looping through the letters of the word
   * and finding matches. Returns if the number of pairs of letters is half of the
   * length of the given word
   * 
   * @param str the string to check to see if it is a doubloon
   * @return    whether not the given str is a doubloon
   */ 
  public static boolean isDoubloon(String str) {
    str = str.toLowerCase();
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      for (int i2 = i + 1; i2 < str.length(); i2++) {
        if (str.charAt(i) == str.charAt(i2)) count++;
      }
    }
    if (count == str.length() / 2.0) return true;
    return false;
  }
  public static void main(String[] args) {
    // Creating a new Scanner object
    Scanner kbd = new Scanner(System.in);
    
    // Prompts the user for a word and stores it in input
    System.out.println("Enter a word.");
    String input = kbd.nextLine();
    
    // Checks to see if the word is a doubloon and prints a corresponding response
    if (isDoubloon(input)) System.out.println("That is a doubloon.");
    else System.out.println("That isn't a doubloon.");
  }
<<<<<<< HEAD
}
=======
}
>>>>>>> ea76cb64b226ea68cddb3552929f7a12f9045ad2
