package general;
//Input Format: N = 3
//        Result:
//          *
//         ***
//        *****
//        *****
//         ***
//          *

public class Pattern_6 {
    public static void main(String[] args) {
        int N = 6;
        pyramid(N);
        invertedPyramid(N);
    }

    private static void invertedPyramid(int n) {
        for(int  i = 0 ;i < n;i++){
            for(int j = 0 ;j<i;j++){
                System.out.print(" ");
            }
            for(int j = 0; j< (2*n - (2*i+1));j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void pyramid(int n) {
        for(int i = 0 ; i<n;i++){
            for(int j = 0; j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j<2*i+1; j++){
                System.out.print("*");
            }
            for(int j = 0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
