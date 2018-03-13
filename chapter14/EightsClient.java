/**
 * EightsClient.java
 * @author Ben Durham
 * @version 20180305
 * Testing the Eights class
 */

import java.util.ArrayList;

public class EightsClient {
    public static void main(String[] args) {
        int[] scores = new int[3];
        for (int i = 0; i < 999; i++) {
            ArrayList<Player> players = new ArrayList<Player>();
            Player player1 = new Player("Test One");
            Player player2 = new Player("Test Two");
            Player player3 = new Player("Test Three");
            players.add(player1);
            players.add(player2);
            players.add(player3);
            
            Eights game = new Eights(players);
            Player winner = game.playGame();
            if (winner.getName() == "Test One") scores[0]++;
            else if (winner.getName() == "Test Two") scores[1]++;
            else scores[2]++;
        }
        System.out.println("One: " + scores[0]);
        System.out.println("Two: " + scores[1]);
        System.out.println("Three: " + scores[2]);
    }
}