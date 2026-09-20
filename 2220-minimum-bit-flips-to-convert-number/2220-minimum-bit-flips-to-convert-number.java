class Solution {
    public int minBitFlips(int start, int goal) {
        int n = start ^ goal;
        int count = 0;
        while (n > 0) {
            n = n & (n - 1); // going through only set bits
            count++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna