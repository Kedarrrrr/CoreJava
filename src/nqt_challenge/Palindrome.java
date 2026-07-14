package nqt_challenge;

public class Palindrome {
	public static boolean Check(String x) {
		String m="";
		for(int i=x.length()-1; i>=0; i--) {
			m+=x.charAt(i);
		}
		return m.equals(x);
	}
	
	public static void main(String[] args) {
		String s = "Edmame";
		s=s.toLowerCase();
		boolean msg = Check(s);
		System.out.println(msg);
	}
}
