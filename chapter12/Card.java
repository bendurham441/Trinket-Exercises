/**
 * Card.java
 * @author Ben Durham
 * @version 20180209
 * Represents a card
 */

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

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
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        } 
        if (that.rank == 1 || this.rank < that.rank) {
            return -1;
        }
        if (this.rank == 1 || this.rank > that.rank) {
            return 1;
        }
        return 0;
    }
    
    public String toString() {
        String s = RANKS[this.rank] + " of " + SUITS[this.suit];
        return s;
    }
    
    public static int search(Card[] cards, Card target) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].equals(target)) return i;
        }
        return -1;
    }
    
    public static int binarySearch(Card[] cards, Card target) {
        int low = 0;
        int high = cards.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int comp = cards[mid].compareTo(target);
            
            if (comp == 0) {
                return mid;
            } else if (comp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    
    public static void printDeck(ArrayList<Card> cards) {
        for (Card card: cards) {
            System.out.println(card);
        }
    }
    
    public static ArrayList<Card> makeDeck() {
        ArrayList<Card> cards = new ArrayList<Card>(52);
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards.add(new Card(rank, suit));
            }
        }
        return cards;
    }
    
    public static void shuffle(ArrayList<Card> cards) {
        Random rand = new Random();
	for (int i = cards.size() - 1; i > 0; i--) {
		int index = rand.nextInt(51);
		Collections.swap(cards, index, i);
	}
    }
    
    public static int[] suitHist(Card[] cards) {
        int[] hist = new int[4];
        for (int i = 0; i < cards.length; i++) {
            hist[cards[i].suit]++;
        }
        return hist;
    }
}
