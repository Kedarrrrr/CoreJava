package practice;
import java.util.Scanner;

public class Even {
	public static void IsEven(int a) {
		if(a%2==0) {
			System.out.println("The Number: "+a+"is Even");
		}else {
			System.out.println("The Number: "+a+"is Odd");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a=sc.nextInt();
		IsEven(a);
	}

}
