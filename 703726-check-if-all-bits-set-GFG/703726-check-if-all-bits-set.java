class Solution {
    public boolean isBitSet(int n) {
        if(n <= 0)
        return false;
        // The idea is that if a number n has all bits set in its binary representation 
        // (like 7 → 111), then adding 1 to it will produce a power of two (like 8 → 1000).
        // x = n + 1;
        // return (x & (x-1)) == 0;
        return ((n + 1) & n) == 0;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna