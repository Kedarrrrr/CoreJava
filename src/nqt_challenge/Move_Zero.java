package nqt_challenge;

import java.util.Arrays;

public class Move_Zero {
	public static void main(String args[]) {
		int[]numbers= {0,1,0,3,12};
		int j=0;
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i]!=0) {
				numbers[j]=numbers[i];
				j++;
			}
		}
		while(j<numbers.length) {
			numbers[j]=0;
			j++;
		}
		System.out.println(Arrays.toString(numbers));
	}
}
