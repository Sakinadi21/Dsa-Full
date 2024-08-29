package Array;

import java.util.Arrays;

public class ThreeSum {

    public void threeSum(int[] arr, int target) {
        Arrays.sort(arr); // Sort the array
        for (int i = 0; i < arr.length - 2; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == target) {
                    System.out.println(arr[i] + " , " + arr[j] + " , " + arr[k]);
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};  // Example array
        int target = 15;  // Example target sum

        ThreeSum ts = new ThreeSum();
        ts.threeSum(arr, target);
    }
}
