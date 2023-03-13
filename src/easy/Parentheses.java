package easy;

import java.util.Arrays;
import java.util.Stack;

public class Parentheses {

    public static void main(String[] args) {
        System.out.println(isValid("([])"));
        System.out.println(isValid("(())()"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("("));
        System.out.println(isValid("(("));
        System.out.println(isValid("]"));
    }

    public static boolean isValid(String s) {
        final Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            final Character current = s.charAt(i);
            //System.out.println("Current: " + current + " Stack: " + Arrays.toString(stack.toArray()));
            switch (current) {
                case '(':
                case '[':
                case '{':
                    stack.push(current);
                    break;
                case ')':
                    if (stack.size() == 0 || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.size() == 0 || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.size() == 0 || stack.pop() != '{') {
                        return false;
                    }
                    break;
            }
        }
        return stack.size() == 0;
    }
}
