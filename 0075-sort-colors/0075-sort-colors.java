class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0;
        int ones = 0;

        for (int n : nums) {
            if (n == 0) {
                zeros++;
            } else if (n == 1) {
                ones++;
            }
        }

        int i = 0;
        while (i < nums.length) {
            if (i < zeros) { // index is less than zeros count
                nums[i] = 0;
            } else if (i >= zeros && i < (zeros + ones)) {
                // index is greater than zeros count and less than (zeros + ones) count
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
            i++;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna