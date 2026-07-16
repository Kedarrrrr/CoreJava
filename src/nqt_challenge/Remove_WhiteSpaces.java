package nqt_challenge;

public class Remove_WhiteSpaces {

	public static void main(String[] args) {
		String s ="Jack and Jill went up the hill.";
		s=s.replaceAll("\\s", "");
		System.out.println(s);
	}
}
