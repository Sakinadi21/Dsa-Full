package MergeSort;

/*
 * Problem: Sort an array consisting of only three distinct values (e.g., 0, 1, 2) such that
 * all occurrences of one value come first, followed by all occurrences of the second value,
 * and then all occurrences of the third value.
 *
 * This problem is also known as the "Dutch National Flag Problem," where the goal is to
 * sort an array of 0s, 1s, and 2s in a single pass with constant space complexity.
 */

public class NationalFlag {

    // Function to sort an array containing 0s, 1s, and 2s
    void threeNumberSort(int[] arr){
        int i = 0;
        int j = 0;
        int k = arr.length - 1;

        // Traverse the array and sort the elements
        while (i <= k){
            if(arr[i] == 0){
                swap(arr, i, j);
                i++;
                j++;
            } else if(arr[i] == 1){
                i++;
            } else if(arr[i] == 2){
                swap(arr, i, k);
                k--;
            }
        }
    }

    // Swap function to swap two elements in the array
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        NationalFlag nf = new NationalFlag();
        nf.threeNumberSort(arr);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
