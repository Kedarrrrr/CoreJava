package nqt_challenge;

import java.util.HashSet;

public class UnionOfArray {
	  public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 4, 5};
	        int[] arr2 = {4, 5, 6, 7, 8};

	        HashSet<Integer> union = new HashSet<>();

	        // Add elements of first array
	        for (int num : arr1) {
	            union.add(num);
	        }

	        // Add elements of second array
	        for (int num : arr2) {
	            union.add(num);
	        }

	        System.out.println("Union of arrays:");
	        for (int num : union) {
	            System.out.print(num + " ");
	        }
	    }
}
