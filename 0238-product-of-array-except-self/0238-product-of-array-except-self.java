class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        //prefix products except self
        result[0] = 1; // there are no previous element for first index item
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // suffix products except self
        int suffix = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix = suffix * nums[i + 1];
            result[i] = result[i] * suffix; // multiplying with prefix product for that element
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna