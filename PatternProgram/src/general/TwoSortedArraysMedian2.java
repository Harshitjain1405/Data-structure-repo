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
public class TwoSortedArraysMedian2 {

    public static void main(String[] args) {
        TwoSortedArraysMedian2 twoSortedArraysMedian2 = new TwoSortedArraysMedian2();

        // Test Case 1: Odd total
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double median1 = twoSortedArraysMedian2.findMedianSortedArrays2(nums1, nums2);
        System.out.println("Median is: " + median1); // Output: 2.0

        // Test Case 2: Even total
        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        double median2 = twoSortedArraysMedian2.findMedianSortedArrays2(nums3, nums4);
        System.out.println("Median is: " + median2); // Output: 2.5
    }

    private double findMedianSortedArrays2(int[] nums1, int[] nums2) {
       int[] merged = new int[nums1.length + nums2.length];
       int i = 0, j = 0, k = 0;

       while (i < nums1.length && j < nums2.length) {
           if(nums1[i] <= nums2[j]) {
               merged[k++] = nums1[i++];
           } else {
               merged[k++] = nums2[j++];
           }
       }

       //remaining elements in num1
        while(i < nums1.length) {
            merged[k++] = nums1[i++];
        }

        //remaining elements in num2
        while(j < nums2.length) {
            merged[k++] = nums2[j++];
        }
         int len = merged.length;

        if(len % 2 == 0) {
            return (merged[len/2 - 1] + merged[len/2]) / 2.0;
        } else {
            return merged[len/2];
        }
    }
}
