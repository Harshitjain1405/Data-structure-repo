package general;

import java.util.Arrays;

public class NonOverlappingIntervals {

    /**
     * Solution class that will be instantiated for each test case
     */
    public static class Solution {
        /**
         * Given an array of intervals, intervals where intervals[i] = [start_i, end_i],
         * return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
         *
         * Example:
         * Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
         * Output: 1
         * Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
         *
         * @param intervals array of intervals [start, end]
         * @return minimum number of intervals to remove
         */
        public int eraseOverlapIntervals(int[][] intervals) {


            //Implement your solution here

            Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

            int count = 0;
            int prev = Integer.MIN_VALUE;

            for (int[] interval : intervals) {
                if (interval[0] < prev) {
                    count++;
                } else {
                    prev = interval[1];
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        /*
         * Intervals visualization:
         *
         *    0  1  2  3  4  5
         *    |__|__|__|__|__|
         * [1,2]
         *       [2,3]
         *          [3,4]
         * [1,      3]
         *
         * After removing [1,3], the remaining intervals don't overlap.
         * Expected result: 1 interval to remove
         */
        int[][] test1 = new int[][] {
                {1, 2}, {2, 3}, {3, 4}, {1, 3}
        };
        testEraseOverlapIntervals(test1, 1);

        /*
         * Intervals visualization:
         *
         *    0  1  2  3  4  5
         *    |__|__|__|__|__|
         * [1,    3]
         * [2,       4]
         *    [2, 3]
         *          [4,5]
         *
         * After removing [1,3] and [2,4], the remaining intervals don't overlap.
         * Expected result: 2 intervals to remove
         */
        int[][] test2 = new int[][] {
                {1, 3}, {2, 4}, {2, 3}, {4, 5}
        };
        testEraseOverlapIntervals(test2, 2);

        /*
         * Intervals visualization:
         *
         *    0  1  2  3  4  5
         *    |__|__|__|__|__|
         * [1,2]
         * [1,2]
         * [1,2]
         *
         * After removing 2 [1,2] intervals, only one remains.
         * Expected result: 2 intervals to remove
         */
        int[][] test3 = new int[][] {
                {1, 2}, {1, 2}, {1, 2}
        };
        testEraseOverlapIntervals(test3, 2);

        /*
         * Intervals visualization: Non-overlapping intervals
         *
         *    0  1  2  3  4  5  6  7  8
         *    |__|__|__|__|__|__|__|__|
         * [1,2]
         *       [3,4]
         *             [5,6]
         *                   [7,8]
         *
         * No intervals need to be removed as they don't overlap.
         * Expected result: 0 intervals to remove
         */
        int[][] test4 = new int[][] {
                {1, 2}, {3, 4}, {5, 6}, {7, 8}
        };
        testEraseOverlapIntervals(test4, 0);

        /*
         * Intervals visualization: Completely overlapping intervals
         *
         *    0  1  2  3  4  5  6
         *    |__|__|__|__|__|__|
         * [1,                  6]
         *    [2,            5]
         *       [3,      4]
         *
         * After removing [1,6] and [2,5], only [3,4] remains.
         * Expected result: 2 intervals to remove
         */
        int[][] test5 = new int[][] {
                {1, 6}, {2, 5}, {3, 4}
        };
        testEraseOverlapIntervals(test5, 2);

        /*
         * Intervals visualization: Empty array
         *
         * No intervals to remove.
         * Expected result: 0 intervals to remove
         */
        int[][] test6 = new int[][] {};
        testEraseOverlapIntervals(test6, 0);

        /*
         * Intervals visualization: Single interval
         *
         *    0  1  2  3
         *    |__|__|__|
         * [1,      3]
         *
         * No intervals to remove.
         * Expected result: 0 intervals to remove
         */
        int[][] test7 = new int[][] {
                {1, 3}
        };
        testEraseOverlapIntervals(test7, 0);

        /*
         * Intervals visualization: Complex case
         *
         *    0  1  2  3  4  5  6  7  8  9 10
         *    |__|__|__|__|__|__|__|__|__|__|
         * [1,3]
         *    [2,4]
         *          [5,7]
         *             [6,8]
         *       [3,      6]
         *                   [8,10]
         *
         * After removing [2,4] and [6,8], the remaining intervals don't overlap.
         * Expected result: 2 intervals to remove
         */
        int[][] test8 = new int[][] {
                {1, 3}, {2, 4}, {5, 7}, {6, 8}, {3, 6}, {8, 10}
        };
        testEraseOverlapIntervals(test8, 2);

        System.out.println("All tests completed. If no failures were reported, all tests passed!");
    }

    private static void testEraseOverlapIntervals(int[][] intervals, int expected) {
        System.out.println("Testing with intervals: " + intervalsToString(intervals));

        // Create a new instance of Solution for each test
        Solution solution = new Solution();
        int result = solution.eraseOverlapIntervals(intervals);

        if (result == expected) {
            System.out.println("✓ Test passed!");
        } else {
            System.out.println("✗ Test failed!");
            System.out.println("  Expected: " + expected);
            System.out.println("  Got: " + result);
        }
        System.out.println();
    }

    private static String intervalsToString(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < intervals.length; i++) {
            sb.append("[").append(intervals[i][0]).append(",").append(intervals[i][1]).append("]");
            if (i < intervals.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

