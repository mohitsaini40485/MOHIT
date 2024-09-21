/**
 * Card Trick class
 * Modifier: Mohit Kumar, 991747327
 * Date Modified: [20 September 2024]
 */
public class CardTrick {
    public static void main(String[] args) {
        // Array to hold the suits of cards
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Array to represent a hand of 7 cards
        Card[] hand = new Card[7];  // Assuming you have a Card class

        // Loop to generate 7 random cards
        for (int i = 0; i < hand.length; i++) {
            int cardValue = (int) (Math.random() * 13 + 1);  // Generate random card value (1 to 13)
            String suit = suits[(int) (Math.random() * 4)];  // Randomly pick a suit from the suits array
            hand[i] = new Card(cardValue, suit);  // Assuming Card constructor takes value and suit
        }

        // Print the generated hand for testing purposes
        System.out.println("Your magic hand of cards:");
        for (Card card : hand) {
            System.out.println(card);
        }

        // Adding the luckyCard object (hardcoded)
        Card luckyCard = new Card(7, "Hearts");  // Example hardcoded lucky card
        System.out.println("\nYour lucky card is: " + luckyCard);

        // Check if the lucky card is in the hand
        boolean isLuckyCardFound = false;
        for (Card card : hand) {
            if (card.equals(luckyCard)) {
                isLuckyCardFound = true;
                break;
            }
        }

        // Report the result
        if (isLuckyCardFound) {
            System.out.println("Congratulations! Your lucky card is in the magic hand.");
        } else {
            System.out.println("Sorry, your lucky card is not in the magic hand.");
        }
    }
}
