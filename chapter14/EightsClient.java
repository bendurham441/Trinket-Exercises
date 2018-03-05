/**
 * EightsClient.java
 * @author Ben Durham
 * @version 20180305
 * Testing the Eights class
 */

public class EightsClient {
    public static void main(String[] args) {
        Player player1 = new Player("Test One");
        Player player2 = new Player("Test Two");
        Eights game = new Eights(player1, player2);
        game.playGame();
    }
}