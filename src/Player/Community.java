package Player;

import java.util.ArrayList;

import Deck.Card;

public class Community {

	ArrayList<Card> card = new ArrayList<>();
	
	public ArrayList<Card> getCard() {
		return card;
	}
	
	public void printCard() {
		for (int i = 0; i < card.size(); i++) {
			switch (card.get(i).getNumber()) {
			case 11:
				System.out.print(" J");
				break;
			case 12:
				System.out.print(" Q");
				break;
			case 13:
				System.out.print(" K");
				break;
			default:
				System.out.print(" "+card.get(i).getNumber());
				break;
			}
			switch (card.get(i).getSuit()) {
			case 0 :
				System.out.println(" Spade");
				break;
			case 1 :
				System.out.println(" Diamond");
				break;
			case 2 :
				System.out.println(" Heart");
				break;
			case 3 :
				System.out.println(" Clover");
				break;
			}
		}
	}
}
