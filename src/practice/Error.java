package practice;

import java.util.*;

class calculator{
    int divide (int a, int b){
        return a/b;
    }
    int add (int a, int b){
        return a+b;
    }
    int sub(int a, int b){
        return a-b;
    }
    int multiply(int a, int b){
        return a*b;
    }
    double add(double a, double b){
        return a+b;
    }
    double divide(double a, double b){
        return a/b;
    }
    double sub(double a, double b){
        return a-b;
    }
    double multiply(double a, double b){
        return a*b;
    }
}


public class Error {
    public static void main (String[] args)throws ArithmeticException{
        calculator c = new calculator();
        double a;
        double b;
        String ops;
        Scanner sc = new Scanner(System.in);
        System.out.println("num 1");
        a=sc.nextDouble();

        System.out.println("num 2");
        b=sc.nextDouble();
        sc.nextLine();

        System.out.println("op");
        ops=sc.nextLine();

        double result;

        if(ops.equals("/")&& b==0){
            throw new ArithmeticException("Zero cannot be denominator.");
        }else{
            //c.divide(a, b);

            switch (ops) {
                case "+":
                    result=c.add(a, b);
                    
                    break;
                case "-":
                    result=c.sub(a, b);
                    break;
                case "*":
                    result=c.multiply(a, b);
                    break;
                case "/":
                    result=c.divide(a, b);
                    break;
            
                default:
                    throw new IllegalArgumentException();
            }
            System.out.println(result);
        }
        
        
    }
}
