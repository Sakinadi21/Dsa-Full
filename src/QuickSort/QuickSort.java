package QuickSort;

public class QuickSort {

    // Method to perform QuickSort on the array
    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            sort(arr, low, p - 1);
            sort(arr, p + 1, high);
        }
    }

    // Method to partition the array and return the pivot index
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    // Utility method to swap two elements in the array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Method to print the array
    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test the QuickSort implementation
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        QuickSort qs = new QuickSort();
        System.out.println("Original Array:");
        qs.printArray(arr);

        qs.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        qs.printArray(arr);
    }
}
