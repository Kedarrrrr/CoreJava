package nqt_challenge;

public class Frequency_of_character {
	public static void main(String[] args) {
        String s = "programming";

        for (int i = 0; i < s.length(); i++) {

            int count = 1;

            // Skip if character already counted
            if (s.substring(0, i).indexOf(s.charAt(i)) != -1) {
                continue;
            }

            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            System.out.println(s.charAt(i) + " = " + count);
        }
	}
}
