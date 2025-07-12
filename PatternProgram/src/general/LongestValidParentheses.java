package general;

import java.util.Stack;

/*
Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.



Example 1:

Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".
Example 2:

Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".
Example 3:

Input: s = ""
Output: 0

 */
public class LongestValidParentheses {

    public static void main(String[] args) {
        String str1 = "(()";
        System.out.println("str1 " + longestValidParentheses(str1)); // 2

        String str2 = ")()())";
        System.out.println("str2 " + longestValidParentheses(str2)); // 4

        String str3 = "";
        System.out.println("str3 " + longestValidParentheses(str3)); // 0

    }

    private static int longestValidParentheses(String str) {
        int maxLen = 0;
        if (str.isEmpty()) {
            return maxLen;
        }
        Stack<Integer> stackList = new Stack<>();
        stackList.push(-1);

        for(int i = 0; i< str.length() ; i++) {
            if(str.charAt(i) == '(') {
                stackList.push(i);
            } else {
                stackList.pop();
                if(stackList.isEmpty()) {
                    stackList.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - stackList.peek());
                }
            }
        }
        return maxLen;
    }
}
