//Problem Statement: Given an integer N , write program to count number of digits in N.
//        Example 1:
//        Input: N = 12345
//        Output: 5
//        Explanation: N has 5 digits

public class CountDigits {

    public static void main(String[] args) {
        int n = 12345;
        countNoOfDigits(n);
    }

    private static void countNoOfDigits(int n) {
        int num = n;
        int c = 0;
        while(n != 0){
            n = n/10;
            c++;
        }
        System.out.println("No. of digits of given integer "+num+" is "+c);
    }
}
