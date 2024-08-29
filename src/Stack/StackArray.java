package Stack;

public class StackArray {
    private int top;
    private int[] arr;

    public StackArray(int capacity) {
        top = -1;  // Initialize top to -1 to indicate an empty stack
        arr = new int[capacity];
    }

    public StackArray() {
        this(10);  // Default capacity of 10
    }

    public void push(int data) {
        if (isFull()) {
            throw new RuntimeException("Stack is full !!!");
        }
        top++;  // Increment top first
        arr[top] = data;  // Assign the data to the new top position
    }

    public boolean isFull() {
        return arr.length == size();
    }

    public int size() {
        return top + 1;  // Size is top + 1
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty !!!");
        }
        int result = arr[top];  // Store the value at the top
        top--;  // Decrement top to remove the element
        return result;
    }

    public boolean isEmpty() {
        return top < 0;  // Stack is empty if top is less than 0
    }
}
