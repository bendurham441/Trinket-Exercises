/**
 * WarCard.java
 * @author Ben Durham
 * @version 20170313
 * Represents a card in the game "War"
 */

public class WarCard extends Card {
    public WarCard(int rank, int suit) {
        super(rank, suit);
    }
    
    public int compareTo(WarCard other) {
        boolean thisIsAce = (getRank() == 1) ? true : false;
        boolean otherIsAce = (other.getRank() == 1) ? true : false;
        
        if (thisIsAce && !otherIsAce) return 1;
        else if (!thisIsAce && otherIsAce) return -1;
        else if (thisIsAce && otherIsAce) return 0;
        return super.compareTo(other);
    }
}