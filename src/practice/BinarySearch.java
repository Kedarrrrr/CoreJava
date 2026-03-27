package practice;

public class BinarySearch {

    // Iterative Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // found
            } 
            else if (arr[mid] < target) {
                left = mid + 1; // move right
            } 
            else {
                right = mid - 1; // move left
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60}; // MUST be sorted
        int target = 40;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}