/**
 * Eights.java
 * @author Ben Durham
 * @version 20180305
 * Represents a game of Crazy Eights
 */

import java.util.ArrayList;

public class Eights {
    
    private ArrayList<Player> players;
    private Hand drawPile;
    private Hand discardPile;
    
    public Eights(ArrayList<Player> players) {
        this.players = players;
        
        drawPile = new Hand("draw");
        discardPile = new Hand("discard");
        
        for (int s = 0; s < 4; s++) {
            for (int r = 1; r < 14; r++) {
                drawPile.addCard(new Card(r, s));
            }
        }
        
        drawPile.shuffle();
        
        for (Player p : players) {
            drawPile.deal(p.getHand(), 5);
        }
        drawPile.deal(discardPile, 1);
        
    }
    
    public boolean isDone() {
        int emptyDecks = 0;
        for (Player p : players) {
            if (p.getHand().empty()) return true;
        }
        return false;
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
        int cur_index = players.indexOf(current);
        if (cur_index == players.size() - 1) cur_index = 0;
        else cur_index++;
        return players.get(cur_index);
    }
    
    public void displayState() {
        for (Player p : players) {
            p.getHand().display();
        }

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
    
    public Player playGame() {
        Player player = players.get(0);
    
        // keep playing until there is a winner
        while (!isDone()) {
            if (discardPile.empty()) reshuffle();
            displayState();
            takeTurn(player);
            player = nextPlayer(player);
        }
        
        // display the final score
        for (Player p : players) {
            p.displayScore();
        }
        
        for (int i = 1; i < players.size(); i++) {
            if (players.get(i).getPoints() == 0) return players.get(i);
        }
        return players.get(0);
    }
}