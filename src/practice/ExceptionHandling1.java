package practice;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class ExceptionHandling1 {

    static int division() throws MyException {
        try {
            int a = 23;
            int b = 0;
            return a / b;
        } catch (ArithmeticException e) {
            throw new MyException("Division by zero is not allowed");
        } finally {
            System.out.println("Finally Executed!");
        }
    }

    public static void main(String[] args) {
        try {
            division();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

