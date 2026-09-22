class Solution {
    public static int getFirstSetBit(int n) {
        if(n == 0) return 0;
        if((n & 1) != 0) return 1; // for Odd number
        
        int count = 1;
        while((n & 1) == 0) {
            n = n >> 1;
            count++;
        }
        
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna