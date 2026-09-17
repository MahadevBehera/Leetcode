class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfN = (n * (n + 1)) / 2;
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        return sumOfN - sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna