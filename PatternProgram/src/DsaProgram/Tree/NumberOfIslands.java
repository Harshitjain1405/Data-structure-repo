package DsaProgram.Tree;

import java.util.Objects;

/*
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.



Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
 */
public class NumberOfIslands {
    public static void main(String[] args) {
        String[][] grid = new String[][] {
                {"1","1","1","1","0"},
                {"1","1","0","1","0"},
                {"1","1","0","0","0"},
                {"0","0","0","0","0"}
        };

        int noOfLand = findLand(grid);
        System.out.println(noOfLand);
    }

    private static int findLand(String[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i< m; i++) {
            for(int j = 0; j < n ; j++) {
                if(Objects.equals(grid[i][j], "1")) {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private static void dfs(String[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || !Objects.equals(grid[i][j], "1")) {
            return;
        }
        grid[i][j] = "*";

        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}
