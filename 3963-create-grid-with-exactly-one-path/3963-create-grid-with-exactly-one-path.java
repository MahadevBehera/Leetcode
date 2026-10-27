class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];

        /*
        row = 4 (m) and column = 5 (n)
        grid =
        [" . . . . . ",       ⟵ "." * 5
         " # # # # . ",       ⟵ "#" * 4 + "." 
         " # # # # . ",       ⟵ "#" * 4 + "." 
         " # # # # . "]       ⟵ "#" * 4 + "." 
         */

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append('.');
        }
        // First Row
        grid[0] = sb.toString();
        sb.setLength(0);

        for (int i = 1; i < n; i++) {
            sb.append('#');
        }
        sb.append('.');

        for (int i = 1; i < m; i++) {
            grid[i] = sb.toString();
        }
        return grid;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna