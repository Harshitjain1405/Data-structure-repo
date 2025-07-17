package general;

/*
Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such
that every character in t (including duplicates) is included in the window.
If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.



Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
Example 2:

Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
Example 3:

Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.

 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MinimumSlidingWindow {
    public static void main(String[] args) {
        String minWindow1 = slidingWindow("ADOBECODEBANC", "ABC");
        System.out.println(minWindow1);

        String minWindow2 = slidingWindow("a", "a");
        System.out.println(minWindow2);

        String minWindow3 = slidingWindow("a","aa");
        System.out.println(minWindow3);
    }

    private static String slidingWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        if(s.equals(t)) return s;

        int left = 0, right = 0;
        int valid = 0, start = 0;
        int minLen = Integer.MAX_VALUE;

        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();

        for(char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c,0) + 1);
        }

        while(right < s.length()) {
            char c = s.charAt(right);
            right ++;

            if(need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if(window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }

            while(valid == need.size()) {
                if(right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char d = s.charAt(left);
                left++;

                if(need.containsKey(d)) {
                    if(window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return minLen == Integer.MAX_VALUE? "" : s.substring(start, start + minLen);
    }
}
