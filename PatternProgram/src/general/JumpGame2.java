package general;

/*
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.



Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 */
public class JumpGame2 {
    public static void main(String[] args) {
        int[] nums = new int[] {2,3,1,1,4};

        boolean jump = jumpGame(nums);
        System.out.println(jump);

        int[] nums1 = new int[] {3,2,1,0,4};
        boolean jump2 = jumpGame(nums1);
        System.out.println(jump2);

        int[] nums3 = new int[] {1,2};
        boolean jump3 = jumpGame(nums3);
        System.out.println(jump3);
    }

    private static boolean jumpGame(int[] nums) {
        int farthest = 0;

        for(int i = 0; i<= farthest ; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if(farthest >= nums.length -1) {
                return true;
            }
        }
        return false;
    }

}
