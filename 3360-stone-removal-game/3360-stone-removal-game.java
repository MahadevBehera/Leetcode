class Solution {
    public boolean canAliceWin(int n) {
        int alice = 10;
        while (alice >= 0) {
            if (n >= alice) {
                n = n - alice;
            } else {
                return false;
            }

            if (n >= (alice - 1)) {
                n = n - (alice - 1);
            } else {
                break;
            }
            alice = alice - 2;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna