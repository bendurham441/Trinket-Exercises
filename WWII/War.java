/**
 * War.java
 * @author Ben Durham
 * @version 20180331
 * Methods for the card game War
 */

public class War {
	private Player player1;
	private Player player2;
	private CardCollection deck;
	private CardCollection discardPile;

	public War(Player p1, Player p2) {
		player1 = p1;
		player2 = p2;
		
		deck = new CardCollection("deck");
		discardPile = new CardCollection("discard");
	
		for (int r = 1; r < 14; r++) {
			for (int s = 0; s < 4; s++) {
				deck.add(new Card(r, s));
			}
		}
	
		deck.shuffle();
	}

	public void takeTurn() {
		Card c1 = player1.play();
		Card c2 = player2.play();

		int result = c1.compareTo(c2);

		System.out.println("Player1 " + player1.getHand().size());
		System.out.println("player2 " + player2.getHand().size());
		
		if (result > 0) {
			System.out.printf("%s wins!\n", player1.getName());
			player1.getHand().add(c1);
			player1.getHand().add(c2);
		} else {	
			System.out.printf("%s wins!\n", player2.getName());
			player2.getHand().add(c1);
			player2.getHand().add(c2);
		}
	}

	public void playGame() {
		while (!player1.getHand().isEmpty() && !player2.getHand().isEmpty()) {
			takeTurn();
		}

		if (player1.getHand().isEmpty()) {
			System.out.println("Player Two wins");
		} else {
			System.out.println("Player One Wins");
		}
	}

	public CardCollection getDeck() {
		return deck;
	}

	public Player getP1() {
		return player1;
	}

	public Player getP2() {
		return player2;
	}

	public void printDeck() {
		deck.print();
	}

	public static void main(String[] args) {
		Player p1 = new Player("Player One");
		Player p2 = new Player("Player Two");

		War w = new War(p1, p2);
		w.printDeck();

		w.getDeck().deal(w.getP1().getHand(), 26);
		w.getDeck().deal(w.getP2().getHand(), 26);

		w.playGame();
	}
}
