package Field;

import java.util.LinkedList;
import java.util.Queue;

import Deck.Card;
import Deck.Deck;

public class Dealer {

	Deck deck = new Deck();
	Queue<Card> shuffleDeck = new LinkedList<>();
	
	Dealer () {
		shuffle(deck);
	}
	
	public void shuffle(Deck deck) {
		int index=0;		
		while (true) {		
			index = (int)(Math.random()*deck.getCard().size());
			shuffleDeck.offer(deck.getCard().get(index));
			deck.getCard().remove(index);
			
			if (deck.getCard().size()==0) break;
		}
			
	}
	
}
