package nqt_challenge;

public class Checking_Sequence {

	public static void main(String[] args) {
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        String s2 = "jmosw";

        int i = 0; // Pointer for s1
        int j = 0; // Pointer for s2

        while (i < s1.length() && j < s2.length()) {

            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
            }

            i++;
        }

        if (j == s2.length()) {
            System.out.println("Subsequence");
        } else {
            System.out.println("Not a Subsequence");
        }
	}
}
