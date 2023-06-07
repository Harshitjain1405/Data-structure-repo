package general;
//Input Format: N = 6
//        Result:
//        *
//        ***
//        *****
//        *******
//        *********
//        ***********

public class Pattern_5 {
    public static void main(String[] args){
        pattern_2(6);
    }

    private static void pattern_2(int N) {
        for(int i=0;i<N;i++){
            for(int j = 0; j< N-i-1;j++){
                System.out.print(" ");
            }
            for(int j = 0; j< 2*i+1; j++){
                System.out.print("*");
            }
            for(int j=0;j< N-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
