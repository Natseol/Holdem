package Deck;

import java.util.ArrayList;

public class Deck {
	
	ArrayList<Card> card = new ArrayList<>();

	public Deck() {
		
		for (int i = 0 ; i < 4 ; i++) {
			for (int j = 0; j<13 ; j++) {
				Card oneCard = new Card();
				oneCard.setNumber(j+1);
				oneCard.setSuit(i);
				card.add(oneCard);
			}
		}
	}
	
	public ArrayList<Card> getCard() {
		return card;
	}
}
 