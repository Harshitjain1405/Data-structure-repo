package general;

//Example 1:
//        Input: arr[] = {2,5,1,3,0};
//        Output: 5
//        Explanation: 5 is the largest element in the array.
//        Example2:
//        Input: arr[] = {8,10,5,7,9};
//        Output: 10
//        Explanation: 10 is the largest element in the array.
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,0};
        int n = arr.length;

        largestElement(arr, n);
    }

    private static void largestElement(int[] arr, int n) {
        int max = arr[0];

        for(int i= 1; i<=n-1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest Element : "+max);
    }
}

// Time complexity : O(n)
// Best Time Complexity : O(1)