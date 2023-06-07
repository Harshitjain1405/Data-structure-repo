package general;

//Input Format: N = 3
//        Result:
//        1
//        1 2
//        1 2 3
public class Pattern_3 {

    public static void main(String[] args){
        pattern3(5);
    }

    private static void pattern3(int n) {
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
