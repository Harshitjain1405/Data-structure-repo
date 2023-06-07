package sorting;

//Problem:  Given an array of size n, sort the array using Merge Sort.
//
//        Example :
//        Input: N=7,arr[]={3,2,8,5,1,4,23}
//        Output: 1,2,3,4,5,8,23

import java.util.ArrayList;

public class MergeSorting {
    public static void main(String[] args) {
        int[] arr = {3,2,8,5,1,4,23};
        int n = arr.length;

        mergeSorts(arr,0, n-1);

        System.out.println("After Merge Sort\n");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergeSorts(int[] arr, int low, int high) {

        if(low >= high) return;

        int mid = (low + high)/2;

        mergeSorts(arr, low, mid);
        mergeSorts(arr, mid+1, high);
        merging(arr, low , mid , high);
    }

    private static void merging(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while (left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
            //Residue element from left to mid
            while(left <= mid){
                temp.add(arr[left]);
                left++;
            }

            //Residue element from mid to right
            while(right<= high){
                temp.add(arr[right]);
                right++;
            }

            //Transferring element from temp to arr
            for(int i = low; i<= high ; i++){
                arr[i] = temp.get(i - low);
            }
        }
    }

}
