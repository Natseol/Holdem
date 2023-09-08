package Made;

import Player.Player;

public class Result {

	public static String result(Player player) {
		String result;
		
		int[] pair = Made.pair(player.getCard());
		int[] flush = Made.flush(player.getCard());
		int[] straight = Made.straight(player.getCard());
		
		if (pair[0]==5) {
			result=" "+numJQK(pair[1])+" 포카드";			
		}
		else if (pair[0]==4) {
			result=" "+numJQK(pair[1])+" 풀하우스";
		}
		else if (pair[0]==3) {
			result=" "+numJQK(pair[1])+" 트리플";
		}
		else if (pair[0]==2) {
			result=" "+numJQK(pair[1])+" 투페어";
		}
		else if (pair[0]==1) {
			result=" "+numJQK(pair[1])+" 원페어";
		}
		else { 
			result=" "+numJQK(pair[1])+"탑 노페어";
		}
		
		if (pair[0]<4) {
			if (straight[0]==1) result=" "+numJQK(straight[1])+" 스트레이트";
			if (flush[0]==1) result=" "+numJQK(flush[1])+" 플러쉬";
			if (flush[0]==1&&straight[0]==1) result=" "+numJQK(flush[1])+" 스티플";
		}
		
		return result;
	}
	
	public static String numJQK(int num) {
		String JQK;
		if (num==13) { 
			JQK="K";
		}
		else if (num==12) {
			JQK="Q";
		}
		else if (num==11) {
			JQK="J";
		}
		else {
			JQK=Integer.toString(num);
		}
		return JQK;
	}
	
}
