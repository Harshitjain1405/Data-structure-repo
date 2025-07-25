package general;

import java.util.HashMap;
import java.util.Map;

/*
219. Contains Duplicate II
Easy
Topics
premium lock icon
Companies
Given an integer array nums and an integer k, return true if
there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.



Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */
public class CountDuplicate2 {
    public static void main(String[] args) {
        int[] num = new int[] {1,0,1,1};
        int k = 1;

        boolean isDuplicate = checkDuplicate(num, k);
        System.out.println(isDuplicate);
    }

    private static boolean checkDuplicate(int[] num, int k) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i=0; i< num.length; i++) {
            if(numMap.containsKey(num[i])) {
                if(Math.abs(i - numMap.get(num[i])) <= k){
                    return true;
                }
            }
            numMap.put(num[i], i);
        }
        return false;
    }
}
