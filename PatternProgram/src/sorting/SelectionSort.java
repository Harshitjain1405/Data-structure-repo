package sorting;
//Given an array of N integers, write a program to implement the
// Selection sorting algorithm.
//
//        Examples:
//
//        Example 1:
//        Input: N = 6, array[] = {13,46,24,52,20,9}
//        Output: 9,13,20,24,46,52
//        Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        selectionSort(arr,n);
    }

    private static void selectionSort(int[] arr, int n) {
        for(int i = 0; i <= n-1 ; i++){
            int min = i;
            for(int j = i+1; j <= n-1; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }

            }
            //Swap
            int temp = arr[min];
            arr[min] = arr[i] ;
            arr[i] = temp;
        }
        System.out.println("After selection sort \n");

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
