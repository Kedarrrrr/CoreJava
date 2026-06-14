package practice;

import java.util.Scanner;

public class Array_large {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int size=5;
		int[]num=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the number in Array: ");
			int temp=sc.nextInt();
			num[i]=temp;
		}
		
		int temp=num[0];
		
		for(int value=1; value<size; value++) {
			
			if(num[value]>temp) {
				temp=num[value];
			}
			
		}
		System.out.println("The Largest Number is : "+temp);
		
	}
	
}
