package BinaryHeap;


public class deleteMax {
    private int[] heap;
    private int n; // Number of elements in heap

    public deleteMax(int capacity) {
        heap = new int[capacity + 1];
        n = 0;
    }

    public int deleteMax() {
        if (n == 0) throw new RuntimeException("Heap underflow");

        int max = heap[1];
        swap(1, n);
        n--;
        sink(1);
        heap[n + 1] = 0; // Assuming heap stores integers, reset the last position to 0

        // Resize if the heap is less than 1/4 full
        if (n > 0 && n == (heap.length - 1) / 4) {
            resize(heap.length / 2);
        }
        return max;
    }

    private void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    private void sink(int k) {
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && heap[j] < heap[j + 1]) j++;
            if (heap[k] >= heap[j]) break;
            swap(k, j);
            k = j;
        }
    }

    private void resize(int capacity) {
        int[] temp = new int[capacity];
        for (int i = 1; i <= n; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }
}
