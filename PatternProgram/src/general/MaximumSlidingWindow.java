package general;

import java.util.Arrays;

/*
You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.



Example 1:

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation:
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
Example 2:

Input: nums = [1], k = 1
Output: [1]
 */
public class MaximumSlidingWindow {
    public static void main(String[] args) {

        int[] result1 = maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        System.out.println(Arrays.toString(result1));
    }

    private static int[] maxSlidingWindow(int[] num, int k) {
        int n = num.length;
        int[] result = new int[n-k+1];
        for(int i = 0; i<= n-k; i++) {
            int max = num[i];
            for(int j=i+1; j < i+k; j++) {
                if(num[j] > max) {
                    max = num[j];
                }
            }
            result[i] = max;
        }
        return result;
    }
}
