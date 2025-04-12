package week06CodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//Field a list of cards
	private List<Card> cards;
	
//Initializing a full deck, constructor	
	public Deck() {
		cards = new ArrayList<>();
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for(String suit : suits) {
			for(int i = 0; i <names.length; i++) {
				int value = i + 2; //2-14
				String name = names[i] + " of " + suit;
				cards.add(new Card(value, name));
			}
		}
	}
		public List<Card> getCards() {
			return cards;
		}
		
//Shuffle the deck
public void shuffle() {
	Collections.shuffle(cards);
}

//Drawing the top card from deck
public Card draw() {
	if (!cards.isEmpty()) {
		return cards.remove(0);
	} else {
		System.out.println("Deck is empty.");
		return null;
	}
}

}
