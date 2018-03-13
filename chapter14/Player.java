/**
 * Player.java
 * @author Ben Durham
 * @version 20180305
 * Represents a player in a card game
 */

public class Player {
    
    private String name;
    private Hand hand;
    private int points;
    
    public Player(String name) {
        this.name = name;
        this.hand = new Hand(name);
    }
    
    public Hand getHand() {
        return hand;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPoints() {
        return points;
    }
    
    private Card getEight() {
        for (int i = 0; i < hand.size(); i++) {
            if (hand.getCard(i).getRank() == 8) return hand.popCard(i);
        }
        return null;
    }
    
    public Card play(Eights eights, Card prev) {
        Card eight = getEight();
        Card card = searchForMatch(prev);
        if (eight != null) return eight;
        else if (card == null) {
            card = drawForMatch(eights, prev);
        }
        return card;
    }
    
    public Card searchForMatch(Card prev) {
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.getCard(i);
            if (cardMatches(card, prev)) {
                return hand.popCard(i);
            }
        }
        return null;
    }
    
    public Card drawForMatch(Eights eights, Card prev) {
        while (true) {
            Card card = eights.drawCard();
            System.out.println(name + " draws " + card);
            if (cardMatches(card, prev)) {
                return card;
            }
            hand.addCard(card);
        }

    }
    
    public static boolean cardMatches(Card card1, Card card2) {
        if (card1.getSuit() == card2.getSuit()) {
            return true;
        }
        if (card1.getRank() == card2.getRank()) {
            return true;
        }
        if (card1.getRank() == 8) {
            return true;
        }
        return false;
    }
    
    public void displayScore() {
        int points = 0;
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.getCard(i);
            if (card.getRank() == 8) {
                points += 20;
            } else if (card.getRank() > 10) {
                points += 10;
            } else {
                points += card.getRank();
            }            
        }
        System.out.println(getName() + ": " + points);
        this.points = points;
    }
}