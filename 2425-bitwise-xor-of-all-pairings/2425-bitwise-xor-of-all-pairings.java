class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0;
        int xor2 = 0;

        if (nums2.length % 2 != 0) {
            for (int n : nums1) {
                xor1 = xor1 ^ n;
            }
        }
        if (nums1.length % 2 != 0) {
            for (int n : nums2) {
                xor2 = xor2 ^ n;
            }
        }
        return xor1 ^ xor2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna