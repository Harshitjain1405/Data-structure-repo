package general;

/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).



Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
 */
public class TwoSortedArraysMedian {

    public static void main(String[] args) {
        TwoSortedArraysMedian twoSortedArraysMedian = new TwoSortedArraysMedian();

        // Test Case 1: Odd total
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double median1 = twoSortedArraysMedian.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median is: " + median1); // Output: 2.0

        // Test Case 2: Even total
        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        double median2 = twoSortedArraysMedian.findMedianSortedArrays(nums3, nums4);
        System.out.println("Median is: " + median2); // Output: 2.5
    }

    private double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2,nums1);
        }
        int n = nums1.length; // 1st Array
        int m = nums2.length; // 2nd Array

        int total = n + m;
        int half = (total + 1)/2;

        int low = 0 , high = n;

        while(low <= high) {
            int i = (low + high) /2;
            int j = half - i;

            int leftA = (i == 0) ? Integer.MIN_VALUE : nums1[i-1];
            int leftB = (j == 0) ? Integer.MIN_VALUE : nums2[j-1];
            int rightA = (i == n) ? Integer.MAX_VALUE : nums1[i];
            int rightB = (j == m) ? Integer.MAX_VALUE : nums2[j];

            if(leftA <= rightB && leftB <= rightA) {
                if(total % 2 == 0) {
                    return (Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2.0;
                } else {
                    return  Math.max(leftA, leftB);
                }
            } else if(leftA > rightB) {
                high = i - 1;
            } else {
                low = i + 1;
            }

        }
        throw new IllegalArgumentException("Arrays are not sorted");
    }
}
