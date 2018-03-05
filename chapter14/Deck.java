/**
 * Deck.java
 * @author Ben Durham
 * @version 20180301
 * Represents a deck of cards
 */

public class Deck extends CardCollection {
    
    public Deck(String label) {
        super(label);
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 1; rank < 14; rank++) {
                cards.add(new Card(rank, suit));
            }
        }
    }
    
}