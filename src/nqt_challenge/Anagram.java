package nqt_challenge;

import java.util.Arrays;

public class Anagram {

	public static void main(String [] args) {
		String x="listen";
		String y="silent";
		
		if(x.length()!=y.length()) {
			System.out.println("not ANAGRAM");
		}
		
		char[]m=x.toCharArray();
		char[]n=y.toCharArray();
		
		Arrays.sort(m);
		Arrays.sort(n);
		
		if(Arrays.equals(m,n)) {
			System.out.println("ANAGRAM");
		}else {
			System.out.println("not ANAGRAM");
		}
	}
}
