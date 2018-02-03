/**
 * Tile.java
 * @author Ben Durham
 * @version 20180203
 * Chapter 11, Exercise 3
 * A class to represent a tile a game of Scrabble
 */

public class Tile {
	private char letter;
	private int value;
	
	public Tile(char letter, int value) {
		this.letter = letter;
		this.value = value;
	}

	public void printTile() {
		System.out.printf("%s:%d\n", this.letter, this.value);
	}
	
	public static void testTile() {
		Tile testTile = new Tile('Z', 10);
		testTile.printTile();
	}

	public String toString() {
		return String.format("%s:%d\n", this.letter, this.value);
	}

	public boolean equals(Tile other) {
		return this.letter == other.letter 
			&& this.value == other.value;
	}
	
	public char getLetter() {
		return this.letter;
	}

	public int getValue() {
		return this.value;
	}
	
	public void setLetter(char letter) {
		this.letter =  letter;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
