class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int result = Integer.MAX_VALUE;
        int n = nums.size();
        // prefix sum
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums.get(i);
        }

        for (int i = 0; i < n; i++) {
            for (int len = l; (len <= r); len++) {
                int j = i + len;
                if (j > prefix.length - 1) {
                    break;
                }
                int sum = prefix[j] - prefix[i];
                if (sum > 0) {
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