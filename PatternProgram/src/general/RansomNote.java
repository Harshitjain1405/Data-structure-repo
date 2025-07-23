package general;

import java.util.*;

/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.



Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 */
public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        boolean isConstruct = canConstruct(ransomNote, magazine);
        System.out.println(isConstruct);
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();
        for(Character c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c,0) + 1);
        }

        for(Character c : ransomNote.toCharArray()) {
            if(!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
                return false;
            }
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) - 1);
        }
        return true;
    }
}
