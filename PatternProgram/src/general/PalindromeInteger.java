package general;

public class PalindromeInteger {
    public static void main(String[] args) {
        int num = 121;
        PalindromeInteger palInt = new PalindromeInteger();
        if(isPalInt(num)){
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("It is not a palindrome number");
        }
    }

    private static boolean isPalInt(int num) {
        int rev = 0;
        int temp = num;
        while(num > 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }
        return temp == rev;
    }
}
