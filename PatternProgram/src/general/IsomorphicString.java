package general;

import java.util.HashMap;
import java.util.Map;

/*
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.



Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "foo", t = "bar"

Output: false

Explanation:

The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

Example 3:

Input: s = "paper", t = "title"

Output: true
 */
public class IsomorphicString {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";

        boolean isIsomorphic = isomorphic(s,t);

        System.out.println(isIsomorphic);
    }

    private static boolean isomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        for(int i = 0; i< s.length(); i++) {
           Character sChar = s.charAt(i);
           Character tChar = t.charAt(i);

           if(sMap.containsKey(sChar)) {
               if(sMap.get(sChar) != tChar) return false;
           } else {
               sMap.put(sChar, tChar);
           }

            if(tMap.containsKey(tChar)) {
                if(tMap.get(tChar) != sChar) return false;
            } else {
                tMap.put(tChar, sChar);
            }

        }

        return true;
    }
}
