package nqt_challenge;

public class Intersection {

	public static void main(String[] args) {

		int [] arr_1 = {2, 56, 23, 88, 33};
		int [] arr_2 = {4, 23, 99, 88, 55};
		
		for(int i=0; i<arr_1.length; i++) {
			for(int j=0; j<arr_2.length; j++) {
				if(arr_1[i]==arr_2[j]) {
					System.out.println(arr_2[j]);
				}
			}
		}
	}
}
