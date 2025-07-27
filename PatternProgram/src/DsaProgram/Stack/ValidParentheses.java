package DsaProgram.Stack;

import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "[";
        boolean isValidParentheses = validParentheses(s);
        System.out.println(isValidParentheses);
    }

    private static boolean validParentheses(String s) {
        char[] charArray = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for(char ch : charArray ) {
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();

                if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
