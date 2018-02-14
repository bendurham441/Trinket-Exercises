/**
 * Deck.java
 * @author Ben Durham
 * @version 20180214
 * Represents a deck of Card objects
 */

public class Deck {
    private ArrayList<Card> cards;
    
    public Deck(int n) {
        this.cards = new Card[n];
    }
    
    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }
    
    public Card[] getCards() {
        return this.cards;
    }
    
    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }
}