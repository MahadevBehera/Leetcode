class Solution {
    public int josephus(int n, int k) {
        // formula --> josephus(n,k) = (josephus(n−1,k)+k−1) % n + 1
        /* The position returned by josephus(n - 1, k)
           is adjusted because the recursive call
           josephus(n - 1, k) considers the original
           position k%n + 1 as position 1 
        */
        if(n == 1)
            return 1;
        return ((josephus(n -1, k)) + (k-1)) % n + 1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna