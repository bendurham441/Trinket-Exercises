/**
 * Player.java
 * @author Ben Durham
 * @version 20180315
 * Represents a player
 */

public class Player {
    private String name;
    private CardCollection hand;
    
    public Player(String name) {
        this.name = name;
        hand = new CardCollection(name + " hand");
    }
    
    public String getName() {
        return this.name;
    }
    
    public CardCollection getHand() {
        return hand;
    }
    
    public Card play() {
        Card c = hand.popCard(0);
        System.out.printf("%s plays: %s\n", getName(), c.toString());
        return c;
    }
    
    public String toString() {
        return this.name;
    }
}
