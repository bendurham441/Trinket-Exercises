/**
 * Song.java
 * @author Ben Durham
 * @version 20171128
 * Prints the song "Bottles of Sasparilla on the wall" using a recursive method
 */

public class Song {
    /**
     * Recursively prints the "bottles of sasparilla" song
     * 
     * @param n     The number to start with in the song
     */
    public static void printSong(int n) {
        if (n <= 0) {
            // Breaks out of recursion once they reach 0
            System.out.println("No bottles of sasparilla on the wall,");
            System.out.println("no bottles of sasparilla,");
            System.out.println("ya' can't take one down, ya' can't pass it around,");
            System.out.println("'cause there are no more bottles of sasparilla on the wall!");
        } else {
            // If n is not 0, prints out the song with the given number
            System.out.printf("%d bottles of sasparilla on the wall,\n", n);
            System.out.printf("%d bottles of sasparilla,\n", n);
            System.out.printf("ya' take one down, ya' pass it around,\n");
            System.out.printf("%d bottles of sasparilla on the wall.\n", n - 1);
            
            // Calls the method again with the number 1 less than n
            printSong(n - 1);
        }
    }
    
    public static void main(String[] args) {
        // Calls the method, starting with 99
        printSong(99);
    }
}
