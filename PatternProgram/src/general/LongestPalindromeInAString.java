package general;

public class LongestPalindromeInAString {

    public static void main(String[] args) {
        LongestPalindromeInAString longestPalindromeInAString = new LongestPalindromeInAString();

        String input1 = "babad";
        String input2 = "cbbd";
        String input3 = "a";
        String input4 = "ac";

        System.out.println("Longest Palindrome in 'babad': " + longestPalindromeInAString.longestPalindrome(input1)); // "bab" or "aba"
        System.out.println("Longest Palindrome in 'cbbd': " + longestPalindromeInAString.longestPalindrome(input2));  // "bb"
        System.out.println("Longest Palindrome in 'a': " + longestPalindromeInAString.longestPalindrome(input3));      // "a"
        System.out.println("Longest Palindrome in 'ac': " + longestPalindromeInAString.longestPalindrome(input4));     // "a" or "c"
    }

    private String longestPalindrome(String str) {
        int n = str.length();

        int maxLen = 0;
        String result = "";

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                String s = str.substring(i, j+1);
                if(isPalindrome(s) && s.length() > maxLen) {
                    result = s;
                    maxLen = s.length();
                }
            }
        }
        return result;
    }

    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left <= right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
