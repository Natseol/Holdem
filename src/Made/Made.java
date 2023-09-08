package Made;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Deck.Card;

public class Made {

	public static int[] pair(ArrayList<Card> card) {
		int[] pair = new int[card.size()];
		int count=0;
		int made[]=new int[2];
		int one=0;
		int top=0;
		
		made[1]=0;
		
		for (int i = 0; i < card.size(); i++) {
			for (int j = 0; j < card.size(); j++) {
				if (card.get(i).getNumber()==card.get(j).getNumber()) {
					pair[j]++;
					if (pair[j]>1&&made[1]<card.get(i).getNumber()) made[1]=card.get(i).getNumber();
					if (top<card.get(j).getNumber()) top = card.get(j).getNumber();
				}
			}			
		}
		
		for (int i = 0; i < pair.length; i++) {
			count += pair[i];
			if(pair[i]==1) one++;
		}
		
		switch (count) {
		case 9 :
			made[0]=1;
			break;
		case 11 :
			made[0]=2;
			break;
		case 13 :
			made[0]=3;
			if (one==1) made[0]=2;
			break;
		case 15,17 :
			made[0]=4;
			break;
		case 19 :
			made[0]=5;
			if (one==1) made[0]=3;
			break;
		default :
			made[1]=top;	
			break;		
		}
		return made;
	}
	
	public static int[] flush(ArrayList<Card> card) {
		ArrayList<Integer> flush = new ArrayList<>();
		int made[]=new int[2];
		for (int i = 0; i < card.size(); i++) {
			flush.add(card.get(i).getNumber());			
		}
		Collections.sort(flush);
		
		for (int i = 0; i<3; i++) {
			if (card.get(i).getSuit()==card.get(i+1).getSuit()
					&&card.get(i).getSuit()==card.get(i+2).getSuit()
					&&card.get(i).getSuit()==card.get(i+3).getSuit()
					&&card.get(i).getSuit()==card.get(i+4).getSuit()
					) {
				made[0]=1;
				made[1]=card.get(i+4).getNumber();
			}
		}
		return made;
	}
	
	public static int[] straight(ArrayList<Card> card) {
		ArrayList<Integer> straight = new ArrayList<>();
		int made[]=new int[2];
		for (int i = 0; i < card.size(); i++) {
			straight.add(card.get(i).getNumber());			
		}
		Collections.sort(straight);
		
		for (int i = 0; i<3; i++) {
			if (card.get(i).getNumber()==card.get(i+1).getNumber()+1
					&&card.get(i+1).getNumber()+1==card.get(i+2).getNumber()+2
					&&card.get(i+2).getNumber()+2==card.get(i+3).getNumber()+3
					&&card.get(i+3).getNumber()+3==card.get(i+4).getNumber()+4
					) {
				made[0]=1;
				made[1]=card.get(i+4).getNumber();
			}
			if (card.get(i).getNumber()==card.get(i+1).getNumber()+1
					&&card.get(i+1).getNumber()+1==card.get(i+2).getNumber()+2
					&&card.get(i+2).getNumber()+2==card.get(i+3).getNumber()+3
					&&card.get(i+3).getNumber()+3==card.get(i+4).getNumber()+4
					) {
				made[0]=1;
				made[1]=card.get(i+4).getNumber();
			}
		}
		
		return made;
	}
}
