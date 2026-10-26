class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char digit = '1'; digit <= '9'; digit++) {
                        if (isValidDigit(board, row, col, digit)) {
                            // 1. Do
                            board[row][col] = digit;
                            // 2. Explore
                            if (solve(board)) {
                                return true;
                            }
                            // 3. Otherwise Undo the step-1 (Backtracking)
                            board[row][col] = '.';
                        }
                    }
                    // if we are unable to store any digit from 1 to 9 in the cell (board[row][col]), then return false as we stored wrong digit to previous cells
                    return false;
                }
            }
        }
        return true; // if all cells has digit (already solved), means there is no '.' in any cell
    }

    private boolean isValidDigit(char[][] board, int row, int col, char digit) {
        // Check the digit is already present in specified row and column or not
        for (int i = 0; i < 9; i++) {
            if ((board[row][i] == digit) || (board[i][col] == digit)) {
                return false;
            }
        }

        // Check the digit is already present in the respective sub-box (3x3) or not
        int boxStartRow = (row / 3) * 3; // to get row index of start cell of the sub-box
        int boxStartCol = (col / 3) * 3; // to get col index of start cell of the sub-box

        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                if (board[boxStartRow + k][boxStartCol + l] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    /*
    Here total Cells = 9 * 9 = 81
    We are visiting each cell means 81 cells
    For each cell the possibility of digits are from 1 to 9, means 9 possible digits
    
    Suppose, there are 9 cells and for each cell there are 2 possibilies then the total number of unique combinations for the 9 cells is 2^9 = 512.
    
    Similarly here, the total unique combinations we try for 81 cells is 9^81
    So, Time complexity for the solution = O(9^81) = O(constant)
    For Space complexity, we will invoke max of 9*9 = 81 recursive calls for the method solve()
    
    Time: O(9^(81)), Space: O(81)
    */
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna