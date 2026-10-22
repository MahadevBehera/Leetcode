class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            // checking if the value is int overflow or not
            if (reverse > (Integer.MAX_VALUE / 10) || reverse < (Integer.MIN_VALUE / 10)) {
                return 0;
            }
            reverse = reverse * 10 + (x % 10);
            x = x / 10;
        }
        return reverse;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna