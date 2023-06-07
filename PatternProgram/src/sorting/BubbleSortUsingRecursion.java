package sorting;

//Problem Statement: Given an array of N integers, write a program to implement the Recursive Bubble Sort algorithm.
//
//        Examples:
//
//        Example 1:
//        Input: N = 6, array[] = {13,46,24,52,20,9}
//        Output: 9,13,20,24,46,52
//        Explanation: After sorting we get 9,13,20,24,46,52
public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;

        bubbleSorts(arr,n);
        System.out.println("After bubble sort using recursion");
        for(int i = 0; i<= n-1; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    private static void bubbleSorts(int[] arr, int n) {
        if(n == 1) return;

        for(int i = 0; i<= n-2; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSorts(arr,n-1);
    }
}
