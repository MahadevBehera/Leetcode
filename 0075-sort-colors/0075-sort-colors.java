class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int i = 0;
        while (i <= end) {
            if (nums[i] == 0) {
                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
                start++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                int temp = nums[end];
                nums[end] = nums[i];
                nums[i] = temp;
                end--;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna