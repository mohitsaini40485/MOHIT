public class Card {
    private int value;  // Card value (1 to 13)
    private String suit;  // Suit of the card (Hearts, Diamonds, etc.)

    // Constructor
    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    // Getter methods (optional, if needed)
    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    // Override the toString() method to print the card information
    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
