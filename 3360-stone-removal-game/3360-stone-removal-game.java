class Solution {
    public boolean canAliceWin(int n) {
        int take = 10;
        int step = 0;

        while (n >= take) {
            n = n - take;
            take--;
            step++;
        }
        // Alice -> Bob -> Alice -> Bob
        // odd steps means Alice able to remove stones for that step
        // even steps means Bob able to remove stones for that step
        if ((step % 2) == 0) {
            return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna