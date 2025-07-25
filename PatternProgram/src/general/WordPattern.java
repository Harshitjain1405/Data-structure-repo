package general;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter.


Example 1:

Input: pattern = "abba", s = "dog cat cat dog"

Output: true

Explanation:

The bijection can be established as:

'a' maps to "dog".
'b' maps to "cat".
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"

Output: false

Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"

Output: false
 */
public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";

        boolean isMatch = wordPattern(s, pattern);
        System.out.println(isMatch);
    }

    private static boolean wordPattern(String s, String pattern) {
        int n = pattern.length();
        String[] strArr = s.split("\\s+");
        if (n != strArr.length) return false;
        Map<Character,String> wordMap = new HashMap<>();
        Map<String, Character> characterMap = new HashMap<>();
        for(int i = 0; i< n; i++){
            char ch = pattern.charAt(i);
            String word = strArr[i];
            if(wordMap.containsKey(ch)) {
                if(!wordMap.get(ch).equals(word)) return false;
            } else {
                wordMap.put(ch, word);
            }

            if(characterMap.containsKey(word)) {
                if(characterMap.get(word) != ch) return false;
            } else {
                characterMap.put(word, ch);
            }
        }
        return true;
    }
}
