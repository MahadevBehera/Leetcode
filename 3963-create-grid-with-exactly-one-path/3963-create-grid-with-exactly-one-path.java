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
         
        String firstRow = ".".repeat(n);
        grid[0] = firstRow;

        for (int i = 1; i < m; i++) {
            grid[i] = "#".repeat(n - 1) + ".";
        }

        return grid;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna