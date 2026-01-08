package practice;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Enter the element: ");
			int element=sc.nextInt();
			arr[i]=element;
		}
		System.out.println("Enter the element to search: ");
		int x=sc.nextInt();
		//sc.close();
		for(int j=0; j<n; j++) {
			if(arr[j]==x) {
				System.out.println("Element "+x+" found at "+j);
			}
		}
		
	}

}
