/**
 * DoubloonCheck.java
 * @author Ben Durham
 * @version 20171025
 * Checks to see if a word is a doubloon
 */

import java.util.Scanner;

public class DoubloonCheck {
	public static boolean isDoubloon(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i+1).contains(String.valueOf(str.charAt(i)))) {
				if (str.substring(i+1).contains(String.valueOf(str.charAt(i)))) {
					return false;
				}
			} else return false;
		}
		return true;
	}
		
	public static void main(String[] args) {
		System.out.println(isDoubloon("bboo"));
	}
}
