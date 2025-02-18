// For the problem located at https://leetcode.com/problems/valid-sudoku/

public class Solution {
    public bool IsValidSudoku(char[][] board) {
        bool[,] rows = new bool[9,9];
        bool[,] cols = new bool[9,9];
        bool[,] boxes = new bool[9,9];
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {  // if board spot is not empty
                    int num = board[i][j] - '0' - 1;  // convert char to int val then subtract 1 since we are using it to index
                    int k = (i/3) * 3 + (j/3);
                    if(rows[i,num]) {
                        return false;
                    }
                    rows[i,num] = true;

                    if(cols[j,num]) {
                        return false;
                    }
                    cols[j,num] = true;

                    if(boxes[k,num]) {
                        return false;
                    }
                    boxes[k,num] = true;
                }
            }
        }
        return true;  // return true if we never failed out
    }
}
