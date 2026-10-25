class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] directions = new int[][] {
                { 0, 1 }, // EAST
                { 1, 0 }, // SOUTH
                { 0, -1 }, // WEST
                { -1, 0 } // NORTH
        };

        int[][] result = new int[rows * cols][2];
        int step = 0; // how much step to take
        int dir = 0; // will be used to choose the index from directions[][]
        int cellCount = 0;
        result[cellCount++] = new int[] { rStart, cStart }; // starting cell storing into result

        // doing -1 because we already store first cell data in result as starting cell
        while (cellCount < (rows * cols)) {
            if (dir == 0 || dir == 2) {
                // for EAST and WEST we need to increase step by 1 then spiral will be formed from inside to outer side
                step++;
            }

            for (int i = 0; i < step; i++) {
                rStart = rStart + directions[dir][0];
                cStart = cStart + directions[dir][1];
                if ((rStart >= 0 && rStart < rows) && (cStart >= 0 && cStart < cols)) {
                    result[cellCount++] = new int[] { rStart, cStart };
                }
            }

            dir = (dir + 1) % 4; // to get the direction in the range of 0 -> 3 (0,1,2,3)
        }

        return result;
    }

    // Time : O(Max(rows,cols)^2) // because we are moving out side boundary, max of rows/cols will be covered.
    // Space : O(1) // if we ignore the "result" 2-D array, if we consider then O(rows * cols).
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna