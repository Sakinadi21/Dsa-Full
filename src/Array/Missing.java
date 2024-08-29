package Array;

import java.util.Arrays;

public class Missing {

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }

    public void arrayDemo() {
        int[] arr = {1, 3, 6, 8, 2, 4, 7}; // Example array
        System.out.println("Array:");
        printArray(arr);
        int missingNumber = findMissingNumber(arr);
        System.out.println("Missing number: " + missingNumber);
    }




    public static void main(String[] args) {
        Missing missing = new Missing();
        missing.arrayDemo();
    }
}
