/**
 * CardCollection.java
 * @author Ben Durham
 * @version 20180313
 * A collection of cards
 */

import java.util.Random;
import java.util.ArrayList;

public class CardCollection {
    private ArrayList<Card> cards;
    private final String label;
    
    public CardCollection(String label) {
        this.label = label;
        this.cards = new ArrayList<Card>();
    }
    
    public String getLabel() {
        return this.label;
    }
    
    public int size() {
        return cards.size();
    }
    
    public Card get(int i) {
        return cards.get(i);
    }
    
    public void add(Card card) {
        cards.add(card);
    }
    
    public Card popCard(int i) {
        Card c = get(i);
        remove(i);
        return c;
    }
    
    public void remove(int i) {
        cards.remove(i);
    }
    
    public boolean isEmpty() {
        return size() == 0;
    }
    
    private void swapCard(int i, int j) {
        Card temp = get(i);
        cards.set(i, cards.get(j));
        cards.set(j, temp);
    }
    
    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < size(); i++) {
            swapCard(i, rand.nextInt(size()));
        }
    }
    
    public void print() {
        for (Card c : cards) System.out.println(c);
    }
    
    public void deal(CardCollection c, int n) {
        for (int i = 0; i < n; i++) {
            c.add(this.popCard(0));
        }
    }
}
