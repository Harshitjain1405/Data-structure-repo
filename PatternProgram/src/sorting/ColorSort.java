package sorting;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.



Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 */
public class ColorSort {
    public static void main(String[] args) {
        int[] result1 = sortColor(new int[]{2, 0, 2, 1, 1, 0});

        System.out.println(Arrays.toString(result1));
    }

    private static int[] sortColor(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        mergeSortColour(nums, low, high);
        return nums;
    }

    private static void mergeSortColour(int[] nums, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSortColour(nums, low, mid);
        mergeSortColour(nums, mid + 1, high);
        mergingSortColor(nums, low, mid, high);
    }

    private static void mergingSortColor(int[] nums, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> resultList = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                resultList.add(nums[left]);
                left++;
            } else {
                resultList.add(nums[right]);
                right++;
            }
        }
        while (left <= mid) {
            resultList.add(nums[left]);
            left++;
        }
        while (right <= high) {
            resultList.add(nums[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            nums[i] = resultList.get(i - low);
        }
    }
}
