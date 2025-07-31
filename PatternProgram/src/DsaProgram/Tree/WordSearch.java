package DsaProgram.Tree;
/*
Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.



Example 1:


Input: board = [['A','B','C','E'],['S','F','C','S'],['A','D','E','E']], word = 'ABCCED'
Output: true
Example 2:


Input: board = [['A','B','C','E'],['S','F','C','S'],['A','D','E','E']], word = 'SEE'
Output: true
Example 3:


Input: board = [['A','B','C','E'],['S','F','C','S'],['A','D','E','E']], word = 'ABCB'
Output: false
 */

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = new char[][] {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}

        };
        String word = "SEE";

        boolean isWordFound = wordSearch(board, word);
        System.out.println(isWordFound);
    }

    private static boolean wordSearch(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;

        for(int i =0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(dfsWord(board, 0,i, j, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfsWord(char[][] board, int index, int i, int j, String word) {
        if(index == word.length()) return true;
        if(i < 0 || j <0 || i>= board.length || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }
        char temp = board[i][j];

        board[i][j] = '#';

        boolean isFound =  dfsWord(board, index + 1, i+1,j, word) ||
                dfsWord(board, index + 1, i -1, j, word) ||
                dfsWord(board, index + 1, i, j+1, word) ||
                dfsWord(board, index + 1, i, j-1, word);
        board[i][j] = temp;

        return isFound;
    }
}
