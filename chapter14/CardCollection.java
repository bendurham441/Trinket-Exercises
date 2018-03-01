/**
 * CardCollection
 * @author Ben Durham
 * @version 20180301
 * A set of cards to represent a deck or hand or any other group of cards
 */

import java.util.ArrayList;

public class CardCollection {
    private String label;
    private ArrayList<Card> cards;
    
    public CardCollection(String label) {
        this.label = label;
        this.cards = new ArrayList<Card>();
    }
    
    public void addCard(Card card) {
        this.cards.add(card);
    }
    
    public Card popCard(int i) {
        return this.cards.remove(i);
    }
    
    public Card popCard() {
        int i = this.cards.size() - 1;
        return popCard(i);
    }
    
    public int size() {
        return cards.size();
    }
    
    public boolean empty() {
        return cards.size() == 0;
    }
    
    public Card getCard(int i) {
        return cards.get(i);
    }
    
    public Card lastCard() {
        return cards.get(size() - 1);
    }
    
    public void swapCards(int i, int j) {
        Card temp = cards.get(i);
        cards.set(i, cards.get(j));
        cards.set(j, temp);
    }
    
    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < size(); i++) {
            int j = random.nextInt(i);
            swapCards(i, j);
        }
    }
}