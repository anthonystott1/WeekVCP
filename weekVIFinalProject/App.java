package weekVIFinalProject;

public class App {
	
	 public static void main(String[] args) {
	        // Instantiate deck and players
	        Deck deck = new Deck();
	        Player player1 = new Player("Player 1");
	        Player player2 = new Player("Player 2");

	        // Shuffle the deck
	        deck.shuffle();

	        // Draw cards for each player
	        for (int i = 0; i < 52; i++) {
	            player1.draw(deck);
	            player2.draw(deck);
	        }

	        // Flip cards and compare values
	        for (int i = 0; i < 26; i++) {
	            Card card1 = player1.flip();
	            Card card2 = player2.flip();

	            System.out.println("Player 1's card:");
	            card1.describe();
	            System.out.println("Player 2's card:");
	            card2.describe();

	            if (card1.getValue() > card2.getValue()) {
	                player1.incrementScore();
	                System.out.println("Player 1 received a point.");
	            } else if (card1.getValue() < card2.getValue()) {
	                player2.incrementScore();
	                System.out.println("Player 2 received a point.");
	            } else {
	                System.out.println("It's a tie. No point awarded.");
	            }
	        }

	        // Print final scores
	        System.out.println("Final score:");
	        System.out.println("Player 1: " + player1.getScore());
	        System.out.println("Player 2: " + player2.getScore());

	        // Determine winner
	        if (player1.getScore() > player2.getScore()) {
	            System.out.println("Player 1 wins!");
	        } else if (player1.getScore() < player2.getScore()) {
	            System.out.println("Player 2 wins!");
	        } else {
	            System.out.println("It's a draw!");
	        }
	    }
	}