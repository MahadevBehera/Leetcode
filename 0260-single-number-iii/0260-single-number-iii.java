class Solution {
    public int[] singleNumber(int[] nums) {
        int x = 0;
        for (int n : nums) {
            x = x ^ n;
        }

        // It finds a number which has only 1 bit set and the set bit corresponds to last set bit of x;
        // int k = x & (~(x - 1));
        int k = x & -x; // ~(x - 1) = -x ----> as we know ~x = -(x+1)

        int res1 = 0, res2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & k) != 0) {
                res1 = res1 ^ nums[i]; // group-1 which are odd
            } else {
                res2 = res2 ^ nums[i]; // group-2 which are even
            }
        }

        return new int[] { res1, res2 };

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna