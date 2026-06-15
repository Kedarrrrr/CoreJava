package nqt_challenge;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String args[]) {
		
		String [] players= {"Ruturaj","Sanju","Shivam","Urvil","Dhoni"};
		
		int first_index=0;
		int last_index=players.length-1;
		
		for(int i=0; i<players.length-2;i++) {
			
			String temp=players[last_index];
			players[last_index]=players[first_index];
			players[first_index]=temp;
			
			first_index+=1;
			last_index-=1;
			
		}
		
		System.out.println(Arrays.toString(players));
		
	}
}
