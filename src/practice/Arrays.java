package practice;
import java.util.Scanner;
//import java.util.Arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int[]marks=new int[5];
		for(int i=0; i<marks.length; i++) {
			System.out.println("Enter the number in array");
			int num=sc.nextInt();
			marks[i]=num;
		}
		//System.out.print(Arrays.toString(marks));
	}

}
