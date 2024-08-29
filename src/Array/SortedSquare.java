package Array;

public class SortedSquare {

    // Method to return an array of squares of the sorted input array in sorted order
    public static int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int[] result = new int[n];

        // Traverse the array from the end to the start
        for (int k = n - 1; k >= 0; k--) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                result[k] = arr[i] * arr[i];
                i++;
            } else {
                result[k] = arr[j] * arr[j];
                j--;
            }
        }
        return result;
    }

    // Method to demonstrate the sortedSquares function
    public void arrayDemo() {
        int[] arr = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares(arr);
        printArray(result);
    }

    // Method to print the array
    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        SortedSquare ss = new SortedSquare();
        ss.arrayDemo();
    }
}
