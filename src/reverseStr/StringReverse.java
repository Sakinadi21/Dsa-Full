package reverseStr;

import java.util.Stack;

public class StringReverse {

    public static String reverse(String str) {
        // Check for null or empty string
        if (str == null || str.isEmpty()) {
            return str;
        }

        // Stack to hold characters of the string
        Stack<Character> stack = new Stack<>();
        StringBuilder reversedString = new StringBuilder();

        // Push each character onto the stack
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        // Pop each character from the stack and append to StringBuilder to get the reversed string
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        // Convert StringBuilder to String and return the reversed string
        return reversedString.toString();
    }

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println("Before reverse = " + str);
        System.out.println("After reverse = " + reverse(str));
    }
}
