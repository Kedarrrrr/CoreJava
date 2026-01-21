package practice;
import java.util.Scanner;

//class addition{
//	private int a;
//	private int b;
//	
//	public int add(int a, int b) {
//		return a+b;
//	}
//}

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number 1: ");
		
		int a=sc.nextInt();
		
		System.out.println("Enter the Next number: ");
		int b=sc.nextInt();
		
		try {
			int sum=a/b;
			//addition plus=new addition(a, b);
			System.out.println("addition done");
		}catch(Exception e) {
			System.out.println("Error Handled");
		}
		

	}

}
