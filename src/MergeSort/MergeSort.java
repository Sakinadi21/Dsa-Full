package MergeSort;

public class MergeSort {
    public void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sort(int[] arr, int[] temp, int low, int high){
        if(low < high){
            int mid = low + (high - low) / 2; // Avoid overflow condition
            sort(arr, temp, low, mid);
            sort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
    }

    private void merge(int[] arr, int[] temp, int low, int mid, int high) {
        for(int i = low; i <= high; i++){
            temp[i] = arr[i];
        }

        int i = low; // Traverse left sorted subarray
        int j = mid + 1; // Traverse right sorted subarray
        int k = low; // Will merge both arrays into original array(arr)

        while(i <= mid && j <= high){
            if(temp[i] <= temp[j]){
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            arr[k] = temp[i];
            i++;
            k++;
        }

        // No need to copy the second half (right subarray) as it is already in place
    }

    public static void main(String[] args) {
        int[] arr = new int[] {9, 5, 2, 4, 3, -1};
        MergeSort ms = new MergeSort();
        ms.sort(arr, new int[arr.length], 0, arr.length - 1);
        ms.printArray(arr);
    }
}
