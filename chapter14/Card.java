/**
 * Card.java
 * @author Ben Durham
 * @version 20180209
 * Represents a card
 */

public class Card {
    public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts",
        "Spades"};
    public static final String[] RANKS = {null, "Ace", "2", "3", "4", "5", 
        "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    
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
    
    public boolean equals(Card that) {
        return this.rank == that.rank && this.suit == that.suit;
    }
    
    public int compareTo(Card that) {
        if (this.rank == 1 && that.rank != 1) {
            return 1;
        }
        if (that.rank == 1 && this.rank != 1) {
            return -1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        return 0;
    }
    
    public String toString() {
        String s = RANKS[this.rank] + " of " + SUITS[this.suit];
        return s;
    }
    
    public static int[] suitHist(Card[] cards) {
        int[] hist = new int[4];
        for (int i = 0; i < cards.length; i++) {
            hist[cards[i].suit]++;
        }
        return hist;
    }
}