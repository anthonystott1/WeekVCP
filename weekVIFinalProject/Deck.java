package weekVIFinalProject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        // Populate the deck with standard 52 cards
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Jack", "Queen", "King", "Ace"};
        for (String suit : suits) {
            for (int i = 2; i <= 14; i++) {
                String name = names[i - 2] + " of " + suit;
                cards.add(new Card(i, name));
            }
        }
    }

    // Shuffle method
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Draw method
    public Card draw() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null;
    }
}