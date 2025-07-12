package general;
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow","flight"};

        String prefix = longestCommonPrefix(strs);
        System.out.println(prefix);
    }

    private static String longestCommonPrefix(String[] strs) {
        String start = strs[0];
        int firstStringLen = start.length() - 1;

        for(int i = 1; i<= strs.length - 1; i++) {
            while(!strs[i].startsWith(start)) {
                start = start.substring(0,firstStringLen);
                firstStringLen-- ;
            }
        }
        return start.isEmpty() ? "" : start;
    }
}
