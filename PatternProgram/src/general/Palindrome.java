package general;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {
    public static void main(String[] args) {
        String str = "hello";
        if(palCheck(str)) {
            System.out.println(str+ " is palindrome");
        } else {
            System.out.println(str+ " is not palindrome");
        }
    }

    private static boolean palCheck(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if(str.charAt(left) != str.charAt(right)) return false;
            left++;
            right --;
        }
        return true;
    }
}
