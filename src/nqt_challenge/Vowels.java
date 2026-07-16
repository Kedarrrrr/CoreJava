package nqt_challenge;

public class Vowels {

	public static void main(String[]args) {
		String s= "abcdefghijklmnopqrstuvwxyz";
		int count=0;
		for(int i=0; i<s.length(); i++) {
			char x = s.charAt(i);
			if(x=='a'|| x=='e'|| x=='i'|| x=='o'|| x=='u') {
				count+=1;
			}
		}
		System.out.println(count);
	}
}