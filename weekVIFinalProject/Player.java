package weekVIFinalProject;
import java.util.ArrayList;
import java.util.List;

public class Player {
	  private List<Card> hand;
	    private int score;
	    private String name;

	    public Player(String name) {
	        hand = new ArrayList<>();
	        score = 0;
	        this.name = name;
	    }

	    // Describe method
	    public void describe() {
	        System.out.println("Player: " + name);
	        System.out.println("Score: " + score);
	        System.out.println("Cards in hand:");
	        for (Card card : hand) {
	            card.describe();
	        }
	    }

	    // Flip method
	    public Card flip() {
	        if (!hand.isEmpty()) {
	            return hand.remove(0);
	        }
	        return null;
	    }

	    // Draw method
	    public void draw(Deck deck) {
	        Card card = deck.draw();
	        if (card != null) {
	            hand.add(card);
	        }
	    }

	    // Increment score
	    public void incrementScore() {
	        score++;
	    }

	    // Getter for score
	    public int getScore() {
	        return score;
	    }
	}