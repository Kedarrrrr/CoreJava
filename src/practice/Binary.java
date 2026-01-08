package practice;
import java.util.*;
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Enter the element: ");
			int val=sc.nextInt();
			arr[i]=val;
		}
		System.out.println("Enter the number to Search: ");
		int x=sc.nextInt();
		int right=n;
		int left=0;
		int mid=(right +left)/2;
		while(left<=right) {
			if(arr[mid]==x) {
				System.out.println("element is at "+mid);
			}else if(arr[mid]>x) {
				right=mid-1;
			}else if(arr[mid]<x) {
				left=mid+1;
			}else if(left==right) {
				System.out.print("Element is "+x+" not present in array");
				break;
			}
		}
		
	}

}
