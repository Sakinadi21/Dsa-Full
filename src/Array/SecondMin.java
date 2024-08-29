
package Array;

public class SecondMin {
    int findSecondMax(int[] arr) {
        // Initialize variables
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        // Check if secondMax was updated
        if (secondMax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Array does not have a second maximum value.");
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {13, 34, 2, 34, 33, 1};
        SecondMin sm = new SecondMin();
        System.out.println(sm.findSecondMax(arr));
    }
}
