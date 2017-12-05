/**
 * RecursiveArrayMethods.java
 * @author Ben Durham
 * @version 20171204
 * Uses recursion to recreate the array method maxInRange
 * Chapter 8 Exercise 6
 */

public class RecursiveArrayMethods {
    
    /**
     * Helper function to find the max of two numbers
     * 
     * @param num   an integer
     * @param num2  an integer
     * @return      the maximum of num and num2
     */
    public static int max(int num, int num2) {
        if (num == num2 || num > num2) return num;
        else return num2;
    }
    
    /**
     * Recursive definition of maxInRange
     * 
     * @param arr           the array to operate upon
     * @param lowIndex      the beginning of the range
     * @param highIndex     the end of the range
     * @return              the maximum number with the range of lowIndex to
     *                      highIndex
     * @see                 max
     */
    public static int maxInRange(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) return arr[lowIndex];
        else return max(arr[highIndex], maxInRange(arr, lowIndex, highIndex - 1));
    }
    
    /**
     * Helper function to find maximum number in array using maxInRange()
     * 
     * @param arr   the array to find the maximum of
     * @returns     the maximum number in the array
     * @see         maxInRange
     * @see         max
     */
    public static int maxHelper(int[] arr) {
        return maxInRange(arr, 0, arr.length - 1);
    }
    
    public static void main(String[] args) {
        int[] array = {8, 2, 3};
        
        System.out.println(maxInRange(array, 0, 2));
        System.out.println(maxHelper(array));
        
    }
}
