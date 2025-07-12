package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.



Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> threeSumResult = threeSum(arr);
        System.out.println(threeSumResult);
    }

    private static List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> threeSumResult = new ArrayList<>();
        for(int i = 0; i < num.length - 2; i++) {
            if(i > 0 && num[i] == num[i-1]) continue;

            int left = i + 1;
            int right = num.length - 1;

            while (left < right) {
                int total = num[left] + num[i] + num[right];

                if(total == 0) {
                    threeSumResult.add(Arrays.asList(num[i], num[left], num[right]));

                    while(left < right && num[left] == num[left + 1]) left++;
                    while(left < right && num[right] == num[right - 1]) right--;
                    left++;
                    right--;
                } else if(total < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return threeSumResult;
    }
}
