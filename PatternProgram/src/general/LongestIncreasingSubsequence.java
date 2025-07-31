package general;

import java.util.Arrays;

/*
Given an integer array nums, return the length of the longest strictly increasing subsequence.



Example 1:

Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
Example 2:

Input: nums = [0,1,0,3,2,3]
Output: 4
Example 3:

Input: nums = [7,7,7,7,7,7,7]
Output: 1
 */
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = new int[]{10,9,2,5,3,7,101,18};
        int longestIncreasing = findLongestIncreasingSubsequence(nums);
        System.out.println(longestIncreasing);
    }

    private static int findLongestIncreasingSubsequence(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        Arrays.fill(dp,1);

        for(int i = 1; i< n ; i++) {
            for(int j = 0 ; j < i ; j++) {
                if(nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int maxLen = 0;
        for(int len : dp) {
           maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}
