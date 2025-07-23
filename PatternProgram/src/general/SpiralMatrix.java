package general;

import java.util.ArrayList;
import java.util.List;

/*
Given an m x n matrix, return all elements of the matrix in spiral order.



Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        List<Integer> result = getSpiralMatrix(matrix);
        System.out.println(result);
    }

    private static List<Integer> getSpiralMatrix(int[][] matrix) {
        int left = 0, right = matrix[0].length - 1;
        int top = 0, bottom = matrix.length - 1;
        List<Integer> result = new ArrayList<>();


        while(top <= bottom && left <= right) {
            //Move to left to right on top
            for (int col = left; col <= right; col++) {
                result.add(matrix[top][col]);
            }
            top++;
            //Traverse towards downward
            for(int row = top ; row <= bottom; row++) {
                result.add(matrix[row][right]);
            }
            right--;

            //Traverse from right to left
            if(top <= bottom) {
                for(int col = right ; col >= left; col --) {
                    result.add(matrix[bottom][col]);
                }
                bottom --;
            }

            //Traverse towards upward
            if(left <= right) {
                for(int row = bottom ; row >= top; row--) {
                    result.add(matrix[row][left]);
                }
                left++;
            }

        }
        return result;
    }
}
