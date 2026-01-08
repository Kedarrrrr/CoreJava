package practice;
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l=Integer.MIN_VALUE;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of terms: ");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("enter the number: ");
			int num=sc.nextInt();
			if(num>l) {
				l=num;
			}
		}
		System.out.println("The MAX value is: "+l);
	}

}
