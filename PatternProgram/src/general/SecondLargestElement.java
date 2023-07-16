package general;


//Example 1:
//        Input: [1,2,4,7,7,5]
//        Output: Second Smallest : 2
//        Second Largest : 5
//        Explanation:
//        The elements are as follows 1,2,3,5,7,7 and
//        hence second largest of these is 5 and second smallest is 2
public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        int n = arr.length;
        int secondSmallest = findSecondSmallest(arr, n);
        int secondLargest = findSecondLargest(arr, n);
        System.out.println("Second Smallest: "+secondSmallest);
        System.out.println("Second Largest: "+secondLargest);
    }

    private static int findSecondLargest(int[] arr, int n) {
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        if(n<2)
            return -1;

        for(int i = 0;i<=n-1;i++){
            if(arr[i] < small){
                secondSmall = small;
                small = arr[i];
            } else if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }
        return secondSmall;
    }

    private static int findSecondSmallest(int[] arr, int n) {
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        if(n<2)
            return -1;

        for(int i = 0;i<=n-1;i++){
            if(arr[i] > large){
                secondLarge = large;
                large = arr[i];
            } else if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }
}
