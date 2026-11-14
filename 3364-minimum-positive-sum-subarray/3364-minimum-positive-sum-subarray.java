class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int result = Integer.MAX_VALUE;
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n && ((j - i + 1) <= r); j++) {
                sum = sum + nums.get(j);
                if (l <= (j - i + 1) && sum > 0) {
                    result = Math.min(result, sum);
                }
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna