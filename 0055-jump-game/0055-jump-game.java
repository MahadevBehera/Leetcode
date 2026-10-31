class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        // Using Bottom-up approach
        boolean[] mem = new boolean[n];
        mem[0] = true;
        solve(nums, n, mem);
        return mem[n - 1];
    }

    private void solve(int[] nums, int n, boolean[] mem) {
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if ((mem[j] == true) && (j + nums[j] >= i)) {
                    mem[i] = true;
                    break;
                }
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna