package general;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        if(isAnagram(str1, str2)) {
            System.out.print(str1+" and "+str2+" are both anagrams");
        } else {
            System.out.println(str1+" and "+str2+" are not anagrams");
        }
    }

    private static boolean isAnagram(String str1, String str2) {
        Map<Character, Integer> anagramMap = new HashMap<>();
        if(str1.length() != str2.length()) return false;

        for(int i = 0; i<str1.length(); i++) {
            anagramMap.put(str1.charAt(i),anagramMap.getOrDefault(str1.charAt(i),0) + 1);
            anagramMap.put(str2.charAt(i),anagramMap.getOrDefault(str2.charAt(i),0) + 1);
        }
        for(int i : anagramMap.values()) {
            if( i!= 2) return false;
        }
        return true;
    }
}
