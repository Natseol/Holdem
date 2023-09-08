package Field;

import java.util.Scanner;

import Deck.Card;
import Made.*;
import Player.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Dealer dealer = new Dealer();
		Player player = new Player();
		Com com = new Com();
		Community community = new Community();
		
		player.getCard().add(dealer.shuffleDeck.poll());
		player.getCard().add(dealer.shuffleDeck.poll());
		
		com.getCard().add(dealer.shuffleDeck.poll());
		com.getCard().add(dealer.shuffleDeck.poll());
		
//		community.getCard().add(dealer.shuffleDeck.poll());
//
//		while (community.getCard().size()<5) {
//			community.getCard().add(dealer.shuffleDeck.poll());
//			System.out.println("  내 카드");
//			player.printCard();
//			System.out.println("--------------------");
//			community.printCard();
//
//			scanner.nextLine();
//		}
		
		Card[] card = new Card[5];		
		card[0] = new Card(5,0);
		card[1] = new Card(6,2);
		card[2] = new Card(7,0);
		card[3] = new Card(8,2);
		card[4] = new Card(9,0);
		
		for (int i = 0 ; i < 5 ; i++ ) {
			community.getCard().add(card[i]);
		}		
		System.out.println("  내 카드");
		player.printCard();
		System.out.println("--------------------");
		community.printCard();

		player.totalCard(community.getCard());
		System.out.println();
		
		String playerResult = Result.result(player);
		
		System.out.println(playerResult);
		
	}
}




