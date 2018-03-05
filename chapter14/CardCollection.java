/**
 * CardCollection
 * @author Ben Durham
 * @version 20180301
 * A set of cards to represent a deck or hand or any other group of cards
 */

import java.util.ArrayList;
import java.util.Random;

public class CardCollection {
    
    private String label;
    private ArrayList<Card> cards;
    
    public CardCollection(String label) {
        this.label = label;
        this.cards = new ArrayList<Card>();
    }
    
    public String getLabel() {
        return this.label;
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
        Random random = new Random();
        for (int i = this.size() - 1; i > 0; i--) {
            int j = random.nextInt(i);
            swapCards(i, j);
        }
    }
    
    public void deal(CardCollection that, int n) {
        for (int i = 0; i < n; i++) {
            Card card = popCard();
            that.addCard(card);
        }
    }
    
    public void dealAll(CardCollection that) {
        int n = size();
        deal(that, n);
    }
}