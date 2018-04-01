/**
 * Card.java
 * @author Ben Durham
 * @version 20180313
 * Represents a playing card
 */

public class Card {
    // Static arrays to be referenced for ranks and suits
    private static final String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack",
        "Queen", "King"};
    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    
    private final int rank;
    private final int suit;
    
    public Card(int rank, int suit) {
       this.rank = rank;
       this.suit = suit;
    }
    
    public int getRank() {
        return this.rank;
    }
    
    public int getSuit() {
        return this.suit;
    }
    
    public int compareTo(Card other) {
        if (rank > other.rank) return 1;
        else if (rank == other.rank) return 0;
        else return -1;
    }
    
    public String toString() {
        return String.format("%s of %s", RANKS[rank], SUITS[suit]);
    }
    
    public void print() {
        System.out.println(toString());
    }
}
