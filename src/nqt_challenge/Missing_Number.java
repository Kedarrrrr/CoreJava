package nqt_challenge;

public class Missing_Number {
	public static void main(String args[]) {
		int[]num_1= {1,2,3,4,5};
		int[]num_2= {1,3,4,5};
		int missing_num=0;
		int sum_1=(num_1.length*(num_1.length+1))/2;
		for(int i=0; i<num_2.length;i++) {
			missing_num=missing_num+num_2[i];
		}
		System.out.println(sum_1-missing_num);
	}
}
