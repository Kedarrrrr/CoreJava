package practice;

import java.util.Scanner;

class UnderAgeException extends Exception{
    public UnderAgeException(float age){
        System.out.printf("Age: %.2f%n is considered as underage", age);
    }
}

public class Custom_Exception{
    public static void main(String[] args)throws UnderAgeException{
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Age: ");
        float age=sc.nextFloat();
        if(age<18){
            throw new UnderAgeException(age);
        }else{
            System.out.println("Proceed");
        }

    }
}

