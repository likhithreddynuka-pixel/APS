import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {

        StringBuilder str = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();

        // Find invalid parentheses
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') {
                stack.push(i);
            } 
            else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    str.setCharAt(i, '#');
                }
            }
        }

        // Remaining '(' are invalid
        while (!stack.isEmpty()) {
            str.setCharAt(stack.pop(), '#');
        }

        // Build answer without '#'
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}