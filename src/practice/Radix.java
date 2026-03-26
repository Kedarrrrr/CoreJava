package practice;


import java.util.Arrays;

public class Radix {

    // Main radix sort function
    public static void radixSort(int[] arr) {
        if (arr.length == 0) return;

        int max = getMax(arr);

        // Do counting sort for every digit (1s, 10s, 100s...)
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    // Get maximum value in array
    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    // Counting sort based on digit represented by exp
    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; // output array
        int[] count = new int[10]; // digits 0-9

        // Count occurrences
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // Convert count to cumulative count
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build output array (IMPORTANT: traverse backwards for stability)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy back to original arr
        System.arraycopy(output, 0, arr, 0, n);
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        radixSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}