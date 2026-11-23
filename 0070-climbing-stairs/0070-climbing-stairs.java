class Solution {
    public int climbStairs(int n) {
        int[] mem = new int[n + 1]; // memoization
        return solve(n, mem);
    }

    private int solve(int n, int[] mem) {
        if (n < 0) {
            return 0;
        }

        if (mem[n] > 0) {
            return mem[n];
        }

        if (n == 0 || n == 1) {
            return 1; // we have got 1 way to cover all stairs
        }

        int one_step = solve(n - 1, mem);
        int two_step = solve(n - 2, mem);
        mem[n] = one_step + two_step;

        return mem[n];
    }

    // Time : O(2^n)
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna