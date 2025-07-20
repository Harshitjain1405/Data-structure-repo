package general;

/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
public class FirstOccurance {
    public static void main(String[] args) {
        String haystack = "abc";
        String needle = "c";
        int firstOccur = getFirstOccurance(haystack, needle);
        System.out.println(firstOccur);
    }

    private static int getFirstOccurance(String haystack, String needle) {
        int n1 = haystack.length();
        int n2 = needle.length();

        if(n1 < n2) return -1;

        if(n1 == n2 && needle.equals(haystack)) return 0;

        for (int i = 0; i<= n1 - n2; i++) {
            if(needle.equals(haystack.substring(i,  i+n2))) {
                return i;
            }

        }
        return -1;
    }
}
