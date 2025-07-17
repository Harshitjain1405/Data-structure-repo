package general;

/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.


Example 1:


Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true
Example 2:


Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
Output: false

 */
public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int target = 5;
        boolean isFound = searching(matrix, target);
        System.out.println(isFound);
    }

    private static boolean searching(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int start = 0, end = col - 1;

        while(start < row && end >= 0) {
            int currMatrix = matrix[start][end];

            if(currMatrix == target) {
                return true;
            } else if ( currMatrix > target) {
                end--;
            } else {
                start++;
            }
        }
        return false;
    }
}
