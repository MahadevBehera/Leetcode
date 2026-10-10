class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        // Traverse the 2-D Array
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char value = board[row][col];
                // If the slot is empty, skip validation
                if (value != '.') {
                    // Create unique string tokens for tracking constraints
                    String rowKey = "Row " + row + " has " + value;
                    String colKey = "Column " + col + " has " + value;
                    // Integer division (row/3 and col/3) perfectly groups cells into 9 sub-boxes (0 to 2)
                    String boxKey = "Box " + (row / 3) + "-" + (col / 3) + " has " + value;

                    if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                        return false;
                    }

                }
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna