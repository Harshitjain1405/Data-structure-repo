package general;

import java.util.HashMap;
import java.util.Map;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

 */
public class majorityElement {
    public static void main(String[] args) {
        int[] nums = new int[] {2,2,1,1,1,2,2};
        int n = majorityElements(nums);
        System.out.println(n);
    }

    private static int majorityElements(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums) {
            if(!freqMap.containsKey(num)) {
                freqMap.put(num, 1);
            } else {
                freqMap.put(num, freqMap.get(num) + 1);
            }
        }
        
        int maxKey = 0;
        int maxVal = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> val : freqMap.entrySet()) {
            if(val.getValue() > maxVal) {
                maxVal = val.getValue();
                maxKey = val.getKey();
            }
        }
        return maxKey;
    }
}

