class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int tmpCount = 0;
        for (int n : nums) {
            if (n == 1) {
                tmpCount++;
            } else {
                count = Math.max(count, tmpCount);
                tmpCount = 0;
            }
        }
        return Math.max(count, tmpCount);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna