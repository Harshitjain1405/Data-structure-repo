//Example 1:
//        Input: arr[] = {10,5,10,15,10,5};
//        Output: 10  3
//        5  2
//        15  1
//        Explanation: 10 occurs 3 times in the array
//        5 occurs 2 times in the array
//        15 occurs 1 time in the array

import java.util.HashMap;
import java.util.Map;

public class CountingFrequencyUsingMap {
    public static void main(String[] args) {

        int[] arr = {10,5,10,15,10,5};
        int n = arr.length;

        countingFrequency(arr, n);

    }

    private static void countingFrequency(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }

        //Traversing
        for(Map.Entry<Integer, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + " occurs " + m.getValue() + " times in the array");
        }
    }

}
