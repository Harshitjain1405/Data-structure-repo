package DsaProgram.Tree;

import java.util.Arrays;

/*
You are given an m x n matrix board containing letters 'X' and 'O', capture regions that are surrounded:

Connect: A cell is connected to adjacent cells horizontally or vertically.
Region: To form a region connect every 'O' cell.
Surround: The region is surrounded with 'X' cells if you can connect the region with 'X' cells and none of the region cells are on the edge of the board.
To capture a surrounded region, replace all 'O's with 'X's in-place within the original board. You do not need to return anything.



Example 1:

Input: board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]

Output: [["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]

Explanation:


In the above diagram, the bottom region is not captured because it is on the edge of the board and cannot be surrounded.

Example 2:

Input: board = [["X"]]

Output: [["X"]]
 */
public class SurroundedRegion {
    public static void main(String[] args) {
        char[][] boards = new char[][] {
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        };

        solve(boards);
        System.out.println(Arrays.deepToString(boards));
    }

    private static void solve(char[][] boards) {
        if(boards == null || boards.length == 0) return;
        int row = boards.length;
        int col = boards[0].length;

        for(int i = 0; i< row; i++) {
            dfsBoards(boards, i, 0);
            dfsBoards(boards, i, col - 1);
        }

        for(int j = 0 ; j< col; j++) {
            dfsBoards(boards,0, j);
            dfsBoards(boards, row - 1, j);
        }

        for(int i = 0; i< row; i++) {
            for(int j = 0; j < col; j++) {
                if(boards[i][j] == 'O'){
                    boards[i][j] = 'X';
                }

                if(boards[i][j] == '#') {
                    boards[i][j] = 'O';
                }
            }
        }

    }

    private static void dfsBoards(char[][] boards, int i, int j) {
        if(i < 0 || j < 0 || i>= boards.length || j >= boards[0].length || boards[i][j] != 'O') return;
        boards[i][j] = '#';

        dfsBoards(boards, i -1, j);
        dfsBoards(boards, i+1, j);
        dfsBoards(boards, i, j-1);
        dfsBoards(boards, i , j+1);

    }
}
