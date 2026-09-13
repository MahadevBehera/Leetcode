class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && ((n & (n - 1)) == 0);

        /*
           n = 4 --> 1 0 0
         n-1 = 3 --> 0 1 1
         -----------------------
         AND (&) --> 0 0 0 => 0 ==> 4 is power of 2 ==> 2^2= 4
         
        */
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna