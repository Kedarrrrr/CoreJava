package practice;

import java.util.Scanner;

public class Duplicate_number {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int size=5;
		int[]num=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the number in Array: ");
			int temp=sc.nextInt();
			num[i]=temp;
		}
		
		for(int i=0; i<num.length;i++) {
			
			for(int j=i+1;j<num.length; j++) {
				if(num[i]==num[j]) {
					System.out.println("The Duplicate element is : "+num[i]);
				}

			}
			
		}
		
	}
	
}
