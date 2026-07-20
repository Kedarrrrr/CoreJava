package nqt_challenge;

public class Amstrong_number {

    public static void main(String[] args) {

        int num = 153;
        int original = num;

        // Count digits
        int digits = String.valueOf(num).length();

        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, digits);
            num /= 10;
        }

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }
}