package week06CodingProject;

import java.util.List;
import java.util.ArrayList;

public class Player {
//Field
	private List<Card> hand;
	private int score;
	private String name;
	
//Constructor
	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<>();
		this.score = 0;
	}
	
//Describe method	
	public void describe() {
		System.out.println("Player: " + name + " | Score: " + score);
		System.out.println("Hand: ");
		for(Card card : hand) {
			card.describe();
		}
	}
	
//Flip method
	public Card flip() {
		if(!hand.isEmpty()) {
			return hand.remove(0);
		} else {
			System.out.println(name + "'s hand is empty.");
			return null;
		}
	}
	
//Draw method
	public void draw(Deck deck) {
		Card drawnCard = deck.draw();
		if (drawnCard != null) {
			hand.add(drawnCard);
		}
	}
	
//Score method
	public void incramentScore() {
		score++;
	}

//Getters for score and name
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}

}
