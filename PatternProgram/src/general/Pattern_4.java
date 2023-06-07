package general;

//Input Format: N = 3
//        Result:
//        1
//        2 2
//        3 3 3
public class Pattern_4 {
    public static void main(String[] args){
        pattern4(5);
    }

    private static void pattern4(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
