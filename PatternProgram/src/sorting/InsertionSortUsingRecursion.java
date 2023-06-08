package sorting;

//Problem Statement: Given an array of N integers,
// write a program to implement the Recursive Insertion Sort algorithm.
//
//        Examples:
//
//        Example 1:
//        Input: N = 6, array[] = {13,46,24,52,20,9}
//        Output: 9,13,20,24,46,52
//        Explanation: After sorting we get 9,13,20,24,46,52
public class InsertionSortUsingRecursion {

    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;

        insertionSort(arr, 0 , n);

        System.out.println("After Insertion Sort using recursion");
        for(int i = 0; i<=n-1;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }

    private static void insertionSort(int[] arr, int i, int n) {

        if(i == n) return;

        int j = i;

        while(j> 0 && arr[j-1] > arr[j]) {
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        insertionSort(arr, i+1 , n);
    }
}
