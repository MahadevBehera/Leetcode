class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length; // rows
        int n = matrix[0].length; // columns

        // 4 pointers
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        int direction = 0;
        /*
        direction = 0 : left to right
        direction = 1 : top to bottom
        direction = 2 : right to left
        direction = 3 : bottom to top
        */
        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {
            switch (direction) {
                case 0 -> {
                    // left to right
                    // contant = row (top)
                    for (int i = left; i <= right; i++) {
                        result.add(matrix[top][i]);
                    }
                    top++;
                }

                case 1 -> {
                    // top to bottom
                    // contant = column (right)
                    for (int i = top; i <= bottom; i++) {
                        result.add(matrix[i][right]);
                    }
                    right--;
                }

                case 2 -> {
                    // right to left
                    // contant = row (bottom)
                    for (int i = right; i >= left; i--) {
                        result.add(matrix[bottom][i]);
                    }
                    bottom--;
                }

                case 3 -> {
                    // bottom to top
                    // contant = column (left)
                    for (int i = bottom; i >= top; i--) {
                        result.add(matrix[i][left]);
                    }
                    left++;
                }
            }

            //direction++;
            if (++direction == 4) {
                direction = 0;
            }
        }
        return result;
    }

    // Time : O(m * n)
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna