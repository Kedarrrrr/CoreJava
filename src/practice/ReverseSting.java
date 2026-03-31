package practice;

public class ReverseSting {
    public static void main(String[] args) {
        String str = "hello";
        String reversed = new StringBuilder(str).reverse().toString();
        //reverse
        System.out.println(reversed);
    }
}