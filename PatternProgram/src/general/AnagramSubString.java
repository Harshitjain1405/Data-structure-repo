package general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.



Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".


Constraints:

1 <= s.length, p.length <= 3 * 104
s and p consist of lowercase English letters.
 */
class Solution {


    public List<Integer> findAnagrams(String s, String p) {
        int plen = p.length();
        int slen = s.length();

        List<Integer> resultList = new ArrayList<>();

        if(slen < plen) return resultList;

        Map<Character,Integer> pMap = new HashMap<>();

        for(Character c : p.toCharArray()) {
            pMap.put(c, pMap.getOrDefault(c,0) + 1);
        }

        for(int i = 0; i<=slen - plen; i++) {
            String subString = s.substring(i, i+plen);

            Map<Character, Integer> sMap = new HashMap<>();
            for(Character c : subString.toCharArray()) {
                sMap.put(c, sMap.getOrDefault(c,0) + 1);
            }

            if(pMap.equals(sMap)) {
                resultList.add(i);
            }
        }
        return resultList;
    }
}

public class AnagramSubString {

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.findAnagrams("cbaebabacd", "abc")); // Output: [0, 6]
        System.out.println(sol.findAnagrams("abab", "ab"));        // Output: [0, 1, 2]
    }
}

