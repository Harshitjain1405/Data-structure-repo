package general;

import java.util.HashSet;
import java.util.Set;

/*
Given a string s, find the length of the longest substring without duplicate characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeating longestSubstringWithoutRepeating = new LongestSubstringWithoutRepeating();

        System.out.println(longestSubstringWithoutRepeating.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(longestSubstringWithoutRepeating.lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(longestSubstringWithoutRepeating.lengthOfLongestSubstring("pwwkew"));   // 3
        System.out.println(longestSubstringWithoutRepeating.lengthOfLongestSubstring(""));         // 0
    }

    private Integer lengthOfLongestSubstring(String str) {
        int n = str.length();
        int r = 0, l = 0;
        Set<Character> strSet = new HashSet<>();
        int maxLen = 0;

        while (r < n) {
            if (!strSet.contains(str.charAt(r))) {
                maxLen = Math.max(maxLen, r - l + 1);
                strSet.add(str.charAt(r));
                r++;
            } else {
                strSet.remove(str.charAt(l));
                l++;
            }
        }
        return maxLen;
    }

}
