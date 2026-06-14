package practice;

import java.util.Scanner;

public class Array_2n_Largest {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int size=5;
		int[]num=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the number in Array: ");
			int temp=sc.nextInt();
			num[i]=temp;
		}
		
		int largest=Integer.MIN_VALUE;
		int second_largest=Integer.MIN_VALUE;
		
		for(int value: num) {
			if(value>largest) {
				second_largest=largest;
				largest=value;
			}else if(value>second_largest&& value!=largest) {
				second_largest=value;
			}
		}
		System.out.println("The second Largest number is: "+second_largest);
		
	}
	
}
