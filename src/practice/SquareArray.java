package practice;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

public class SquareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array: ");
		int size=sc.nextInt();
		int []arr=new int[size];
		for(int i=0; i<size; i++) {
			System.out.println("Enter the elements: ");
			int num=sc.nextInt();
			arr[i]=num;
		}
		for(int j=0; j<size; j++) {
			int square=arr[j]*arr[j];
			arr[j]=square;
		}
		String con=Arrays.toString(arr);
		System.out.println(con);
	}

}
