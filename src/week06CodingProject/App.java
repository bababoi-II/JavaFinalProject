package week06CodingProject;

public class App {
    public static void main(String[] args) {
//Instantiate a deck and two players
    	Deck deck = new Deck();
    	Player player1 = new Player("Player 1");
    	Player player2 = new Player("Player 2");

// Shuffle the deck
        deck.shuffle();

// Draw 52 cards total, alternating between both players
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

//Flip 26 times and compare cards
        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            System.out.print("Round " + (i + 1) + ": ");
            if (card1 != null && card2 != null) {
                card1.describe();
                card2.describe();

                if (card1.getValue() > card2.getValue()) {
                    player1.incramentScore();
                    System.out.println("Point to Player 1!\n");
                } else if (card1.getValue() < card2.getValue()) {
                    player2.incramentScore();
                    System.out.println("Point to Player 2!\n");
                } else {
                    System.out.println("Tie!\n");
                }
            }
        }

//Compare final scores
        int score1 = player1.getScore();
        int score2 = player2.getScore();

//Print final results
        System.out.println("Final Scores:");
        System.out.println("Player 1: " + score1);
        System.out.println("Player 2: " + score2);

        if (score1 > score2) {
            System.out.println("Player 1 wins!");
        } else if (score2 > score1) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
