package Stack;

import java.util.Stack;

public class String {

    public boolean isValid(java.lang.String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if ((c == ')' && top == '(') ||
                            (c == '}' && top == '{') ||
                            (c == ']' && top == '[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }


}
