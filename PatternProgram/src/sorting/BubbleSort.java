package sorting;

//Problem Statement: Given an array of N integers, write a program to implement the Bubble Sorting algorithm.
//
//        Examples:
//
//        Example 1:
//        Input: N = 6, array[] = {13,46,24,52,20,9}
//        Output: 9,13,20,24,46,52
//        Explanation: After sorting we get 9,13,20,24,46,52
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        bubbleSort(arr, n);
    }

    private static void bubbleSort(int[] arr, int n) {
        for(int i = 0 ; i<= n-1; i++){
            for(int j = 0; j< n-i-1; j++){
                //Swap
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After Bubble Sort\n");
        for(int i = 0 ; i<=n-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
