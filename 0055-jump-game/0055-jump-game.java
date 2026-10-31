class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        // Using Efficient approach
        int maxReachable = 0; // as we are already standing in 0 index
        for (int i = 0; i < n; i++) {
            // so far for previous elements/jumps, the maxReachable is less than i, so we can't reach i index
            if (i > maxReachable) {
                return false;
            }

            maxReachable = Math.max(maxReachable, (i + nums[i]));
        }

        // if the loop completed and we didn't returned false, then we are already reached the end index (n-1)
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna