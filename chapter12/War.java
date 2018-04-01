/**
 * War.java
 * @author Ben Durham
 * @version 20180212
 * War Card game between two virtual players (cpu vs cpu)
 */

import java.util.ArrayList;

public class War {
    public static void main(String[] args) {
	// Introduces the user to the program
    System.out.println("Welcome to war (between two computers).");
	
	// Creates an ArrayList to serve as a deck for each of the players
	ArrayList<Card> player_one = new ArrayList<Card>(52);
	ArrayList<Card> player_two  = new ArrayList<Card>(52);
	
	// Populates the decks of each player
	player_one = Card.makeDeck();
	player_two = Card.makeDeck();
	
	// Shuffles each deck
	Card.shuffle(player_one);
	Card.shuffle(player_two);

	// Plays the game until one player doesn't have cards left
	while (player_one.size() > 0 && player_two.size() > 0) {
		// Prints what each player drew
		System.out.printf("Player 1 draws %s\n", player_one.get(0).toString());
		System.out.printf("Player 2 draws %s\n", player_two.get(0).toString());

		// Compares the cards and executes accordingly
		if (player_one.get(0).compareTo(player_two.get(0)) > 0) {
			// Informs the user which player won
			System.out.println("Player 1 Wins!");

			// Adds the round's cards to player one's deck
			Card temp = player_two.get(0);
			player_one.add(temp);
			player_one.add(player_one.get(0));
	
			// Removes the cards that were moved to the end
			player_one.remove(0);
			player_two.remove(0);
		} else if (player_one.get(0).compareTo(player_two.get(0)) < 0)  {
			// Informs the user which player won
			System.out.println("Player 2 Wins!");
	
			// Adds the round's cards to player two's deck
			Card temp = player_one.get(0);
			player_two.add(temp);
			player_two.add(player_two.get(0));

			// Removes the cards that were moved to the end
			player_one.remove(0);
			player_two.remove(0);
		} else {
			// Informs the user it was a draw
			System.out.println("It's a draw!");

			// Declares a variable to hold cards while they are moved to the end of
			// the deck
			Card temp = player_one.get(0);

			// Moves the card to the end of player one's deck
			player_one.add(temp);
			player_one.remove(0);

			// Moves the card to the end of player two's deck
			temp = player_two.get(0);
			player_two.add(temp);
			player_two.remove(0);
		}
	}

    // Informs the user which player won the game
	if (player_one.size() > 0) {
	   System.out.println("Player 1 wins the game.");
	} else {
	   System.out.println("Player 2 wins the game.");
	}
    }
}