class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increase = 1;
        int decrease = 1;
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            increase = nums[i - 1] < nums[i] ? increase + 1 : 1;
            decrease = nums[i - 1] > nums[i] ? decrease + 1 : 1;
            result = Math.max(result, (Math.max(increase, decrease)));
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna