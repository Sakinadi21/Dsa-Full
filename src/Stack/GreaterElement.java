package Stack;

import java.util.Stack;

public class GreaterElement {

    int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            // Pop elements from stack while the stack is not empty and the top of the stack is less than or equal to arr[i]
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, then no greater element exists on the right
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push this element into the stack
            stack.push(arr[i]);
        }
        return result;
    }
}
