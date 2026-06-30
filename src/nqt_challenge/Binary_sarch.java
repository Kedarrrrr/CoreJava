package nqt_challenge;

public class Binary_sarch {

    public static void main(String[] args) {

    	int arr []= {2,4,6,8,12};
        int max = arr.length-1;
        int min = 0;
        int x = 4;
        while(min<=max) {
        	int mid = (min+max)/2;
        	if(arr[mid]==x) {
        		System.out.println("Element found at: "+mid);
        		break;
        	}else if(x<arr[mid]) {
        		max=mid-1;
        	}else if(x>arr[mid]) {
        		min=mid+1;
        	}else {
        		System.out.println("Element does not exists");
        	}
        }
    }
}