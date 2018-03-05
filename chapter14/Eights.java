/**
 * Eights.java
 * @author Ben Durham
 * @version 20180305
 * Represents a game of Crazy Eights
 */

import java.util.Scanner;

public class Eights {
    
    private Player one;
    private Player two;
    private Hand drawPile;
    private Hand discardPile;
    private Scanner in;
    
    public Eights(Player one, Player two) {
        this.one = one;
        this.two = two;
        
        drawPile = new Hand("draw");
        discardPile = new Hand("discard");
        
        for (int s = 0; s < 4; s++) {
            for (int r = 1; r < 14; r++) {
                drawPile.addCard(new Card(r, s));
            }
        }
        
        drawPile.shuffle();
        
        drawPile.deal(one.getHand(), 5);
        drawPile.deal(two.getHand(), 5);
        drawPile.deal(discardPile, 1);
        
    }
    
    public boolean isDone() {
        return one.getHand().empty() || two.getHand().empty();
    }
    
    public void reshuffle() {
        Card prev = discardPile.popCard();
        discardPile.dealAll(drawPile);
        discardPile.addCard(prev);
        drawPile.shuffle();
    }
    
    public Card drawCard() {
        if (drawPile.empty()) {
            reshuffle();
        }
        return drawPile.popCard();
    }
    
    public Player nextPlayer(Player current) {
        if (current == one) return two;
        else return one;
    }
    
    public void displayState() {
        one.getHand().display();
        two.getHand().display();
        discardPile.display();
        System.out.printf("There are %d cards left in the draw pile.\n", drawPile.size());
    }
    
    public void takeTurn(Player player) {
        Card prev = discardPile.lastCard();
        Card next = player.play(this, prev);
        discardPile.addCard(next);
        
        System.out.println(player.getName() + " plays " + next);
        System.out.println();
    }
    
    public void playGame() {
        Player player = one;
    
        // keep playing until there is a winner
        while (!isDone()) {
            if (discardPile.empty()) reshuffle();
            displayState();
            takeTurn(player);
            player = nextPlayer(player);
        }
        
        // display the final score
        one.displayScore();
        two.displayScore();
    }
}