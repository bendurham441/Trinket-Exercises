/**
 * Deck.java
 * @author Ben Durham
 * @version 20180214
 * Represents a deck of Card objects
 */

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;
    
    public Deck(int n) {
        this.cards = new ArrayList<Card>(n);
    }
    
    public Deck() {
        this.cards = new ArrayList<Card>(52);
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards.add(new Card(rank, suit));
            }
        }
    }
    
    public ArrayList<Card> getCards() {
        return this.cards;
    }
    
    public void shuffle() {
        for (int i = 0; i < cards.size(); i++) {
            int num = randomInt(i, cards.size() - 1);
            swapCards(i, num);
        }
    }
    
    public void selectionSort() {
        for (int i = 0; i < this.cards.size(); i++) {
            int lowest = indexLowest(i, this.cards.size());
            swapCards(i, lowest);
        }
    }
    
    private int indexLowest(int low, int high) {
        int min = low;
        for (int i = low; i < high; i++) {
            if (cards.get(i).compareTo(cards.get(min)) < 0) min = i;
        }
        return min;
    }
    
    private static int randomInt(int low, int high) {
        if (low == high) return low;
        Random rand = new Random();
        if (low == 0) {
            return rand.nextInt(high);
        } else {
            return rand.nextInt(high - low) + low;
        }
    }
    
    private void swapCards(int i, int j) {
        Collections.swap(this.cards, i, j);
    }
    
    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low);
        System.out.println("test.");
        for (int i = 0; i < high - low + 1; i++) {
            sub.cards.add(this.cards.get(low + i));
        }
        return sub;
    }
    
    private static Deck merge(Deck d1, Deck d2) {
        int len = d1.cards.size() + d2.cards.size();
        Deck res = new Deck(len);
        
        int i = d1.cards.size() - 1;
        int j = d2.cards.size() - 1;
        
        for (int k = 0; k < len / 2; k++) {
            if (d1.cards.get(i).compareTo(d2.cards.get(j)) > 0) {
                res.cards.add(d1.cards.get(i));
                i--;
            } else if (d1.cards.get(i).compareTo(d2.cards.get(j)) < 0) {
                res.cards.add(d2.cards.get(j));
                j--;
            } else {
                res.cards.add(d1.cards.get(i));
                res.cards.add(d2.cards.get(j));
                i--;
                j--;
            }
        }
        return res;
    }
    
    public Deck almostMergeSort() {
        int midpoint = this.cards.size() / 2 + 1;
        Deck d1 = subdeck(0, midpoint);
        Deck d2 = subdeck(midpoint, this.cards.size()- 1);
        d1.selectionSort();
        d2.selectionSort();
        
        return merge(d1, d2);
    }
    
    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }
    
    public static void main(String[] args) {
        Deck d = new Deck(52);
        Random rand = new Random();
        for (int s = 0; s < 4; s++) {
            for (int r = 1; r < 14; r++) {
                Card card = new Card(r, s);
                d.cards.add(card);
            }
        }
        
        Deck d2 = new Deck(52);
        for (int s = 0; s < 4; s++) {
            for (int r = 1; r < 14; r++) {
                Card card = new Card(r, s);
                d2.cards.add(card);
            }
        }
        d.shuffle();
        d2.shuffle();
        d.selectionSort();
        d2.selectionSort();
        Deck d3 = merge(d, d2);
        d3.print();
    }
}