//Problem Statement:  Given an array of n integers, sort the array using the Quicksort method.

//Input: N = 8 , Arr[] = {4,6,2,5,7,9,1,3}
//        Output: 1 2 3 4 5 6 7 9

package sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};

        int n = arr.length;

        quickSort(arr, 0 , n-1);
        System.out.println("After Quick Sort");
        for(int i =0 ; i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void quickSort(int[] arr, int begin, int end) {

        if(begin < end ){
            int partition = partitionIndex(arr, begin , end);

            quickSort(arr,begin, partition - 1);
            quickSort(arr, partition+1, end);
        }



    }

    private static int partitionIndex(int[] arr, int begin, int end) {
        int pivot = arr[end];

        int i = begin - 1;

        for(int j = begin; j< end; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return i+1;
    }

}
