package BubbleSort;

public class BubbleSort {

    /*
    Bubble Sort is also known as Sinking Sort.
    While applying this sorting algorithm on an unsorted array,
    the largest elements tend to sink to the end of the array.
    It repeatedly compares pairs of adjacent elements and swaps
    them if they are in the wrong order.
    */

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sort(int[] arr) {
        int n = arr.length;
        boolean isSwapped;

        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) { // Corrected loop boundary
                if (arr[j] > arr[j + 1]) { // Swap only if the current element is greater than the next
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then the array is sorted
            if (!isSwapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 2, 9, 10};
        BubbleSort bs = new BubbleSort();
        System.out.println("Unsorted array:");
        bs.printArray(arr);
        bs.sort(arr);
        System.out.println("Sorted array:");
        bs.printArray(arr);
    }
}
