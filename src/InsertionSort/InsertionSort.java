package InsertionSort;

public class InsertionSort {
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than temp, to one position ahead
            // of their current position
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 2, 9, 10};
        InsertionSort is = new InsertionSort();
        System.out.println("Unsorted array:");
        is.printArray(arr);
        is.sort(arr);
        System.out.println("Sorted array:");
        is.printArray(arr);
    }
}
