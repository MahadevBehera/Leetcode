class Solution {
    public int grayToBinary(int n) {
        int b = 0;
        // travels all bits of Gray code
        while(n > 0) {
            // build binary number step by step using XOR
            b = b ^ n;
            // move to next bit
            n = n >> 1;
        }
        return b;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna