package practice;
import java.util.Scanner;
public class NewSimple {
	public static float Calculate(int p, int r, int t) {
		float cal=((p*r*t)/100);
		return cal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int r=sc.nextInt();
		int t=sc.nextInt();
		float Simple_Interest=Calculate(p, r, t);
		System.out.println("Simple Interest is: "+Simple_Interest);
	}

}
