class Solution {
    public int reverseBits(int n) {
        int result = 0;
        // loop 32 times (since it's a 32-bit integer)
        for (int i = 0; i < 32; i++) {
            int bit = (n & 1); // Extract the Bit 
            result = result << 1; // Shift the Result and make the "ones" place empty so you can drop a new bit into it.
            result = result | bit; // Combine - put the bit we extracted into the empty space we just created
            n = n >>> 1; // Discard the Used Bit
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna