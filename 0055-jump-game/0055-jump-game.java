class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        // Using DP
        int[] mem = new int[10001]; // 10^4 -> so for safe side took +1
        return solve(nums, 0, n, mem);
    }

    private boolean solve(int[] nums, int index, int n, int[] mem) {
        if (index == n - 1) {
            return true;
        }

        if (mem[index] != 0) {
            return mem[index] == 1 ? true : false;
        }

        for (int i = 1; i <= nums[index]; i++) {
            if (solve(nums, index + i, n, mem)) {
                mem[index] = 1;
                return true;
            }
        }
        mem[index] = 2;
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna