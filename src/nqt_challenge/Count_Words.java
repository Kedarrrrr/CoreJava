package nqt_challenge;

public class Count_Words {
	public static void main(String[] args) {
		String sentence = "          veer bhogya vasundhara,     jai rajputana.";
		String [] s = sentence.trim().split("\\s+");
		System.out.println("Number of words: "+s.length);
	}
}