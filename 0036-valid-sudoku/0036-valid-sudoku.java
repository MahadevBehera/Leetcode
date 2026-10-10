class Solution {
    public boolean isValidSudoku(char[][] board) {
        // rows = 9
        // cols = 9

        if (validateRows(board) && validateCols(board) && validateBoxs(board)) {
            return true;
        }
        return false;
    }

    // validate rows
    public boolean validateRows(char[][] board) {
        for (int row = 0; row < 9; row++) {
            boolean arr[] = new boolean[10];
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.')
                    continue;
                int data = board[row][col] - '0'; // to get int value of char 
                if (arr[data] == true) {
                    return false;
                }
                arr[data] = true;
            }
        }
        return true;
    }

    // validate cols
    public boolean validateCols(char[][] board) {
        for (int col = 0; col < 9; col++) {
            boolean arr[] = new boolean[10];
            for (int row = 0; row < 9; row++) {
                if (board[row][col] == '.')
                    continue;
                int data = board[row][col] - '0'; // to get int value of char 
                if (arr[data] == true) {
                    return false;
                }
                arr[data] = true;
            }
        }
        return true;
    }

    // validate 3*3 boxs
    public boolean validateBoxs(char[][] board) {
        for (int startRow = 0; startRow < 9; startRow += 3) { // to get next box startRow = startRow + 3
            int endRow = startRow + 2;
            for (int startCol = 0; startCol < 9; startCol += 3) {// to get next box startCol = startCol + 3
                int endCol = startCol + 2;
                if (!traverse(board, startRow, endRow, startCol, endCol)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean traverse(char[][] board, int startRow, int endRow, int startCol, int endCol) {
        boolean arr[] = new boolean[10];
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                if (board[i][j] == '.')
                    continue;
                int data = board[i][j] - '0'; // to get int value of char 
                if (arr[data] == true) {
                    return false;
                }
                arr[data] = true;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna