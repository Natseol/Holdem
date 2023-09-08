package Deck;

public class Card {

	int number;
	int suit;
	
	Card() {		
	}
	
	public Card(int num, int suit) {
		number=num;
		this.suit=suit;
	}
	
	public void setNumber(int num) {
		number = num;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setSuit(int suit) {
		this.suit = suit;
	}
	
	public int getSuit() {
		return suit;
	}
}
