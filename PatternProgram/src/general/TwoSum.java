package general;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSum {

    /**
     * Given an array of integers nums and an integer target,
     * return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution,
     * and you may not use the same element twice.
     *
     * Example:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1] (because nums[0] + nums[1] = 2 + 7 = 9)
     *
     * @param nums the input array
     * @param target the target sum
     * @return array of two indices that sum to target
     */
    public static int[] findIndices(int[] nums, int target) {
        //Implement your solution here
        int n = nums.length;
        Map<Integer, Integer> compMap = new HashMap<>();
        for( int i= 0; i <n; i++) {
            int comp = target - nums[i];
            if(compMap.containsKey(comp)) {
                return new int[]{ compMap.get(comp), i};
            }
            compMap.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        testTwoSum(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1});
        testTwoSum(new int[]{3, 2, 4}, 6, new int[]{1, 2});
        testTwoSum(new int[]{3, 3}, 6, new int[]{0, 1});
        testTwoSum(new int[]{1, 5, 8, 3, 9, 2}, 10, new int[]{0, 4});
        testTwoSum(new int[]{-1, -2, -3, -4, -5}, -8, new int[]{2, 4});
        testTwoSum(new int[]{-10, 7, 5, -3, 2, 15}, -8, new int[]{0, 4});

        System.out.println("All tests completed. If no failures were reported, all tests passed!");
    }

    private static void testTwoSum(int[] nums, int target, int[] expected) {
        System.out.println("Testing with array: " + Arrays.toString(nums) + ", target: " + target);

        int[] result = findIndices(nums, target);
        Arrays.sort(result);
        Arrays.sort(expected);

        if (Arrays.equals(result, expected)) {
            System.out.println("✓ Test passed!");
        } else {
            System.out.println("✗ Test failed!");
            System.out.println("  Expected: " + Arrays.toString(expected));
            System.out.println("  Got: " + Arrays.toString(result));

            // Verify that the solution actually works
            if (result.length == 2 && result[0] >= 0 && result[1] < nums.length) {
                if (nums[result[0]] + nums[result[1]] == target) {
                    System.out.println("  However, your solution is also correct: "
                            + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
                }
            }
        }
        System.out.println();
    }
}

