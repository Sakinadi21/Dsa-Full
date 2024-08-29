package Slidingwindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Slide {

    List<Integer> maxSlidingWindow(int[] arr, int k) {
        int[] ngeArr = nextGreaterElement(arr);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= arr.length - k; i++) {
            int j = i;
            while (ngeArr[j] < i + k) {
                j = ngeArr[j];
            }
            result.add(arr[j]);
        }
        return result;
    }

    int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = arr.length;
            } else {
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Slide slide = new Slide();
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7}; // Example array
        int k = 3; // Window size
        List<Integer> result = slide.maxSlidingWindow(arr, k);

        System.out.println("Max in each sliding window: " + result);
    }
}
