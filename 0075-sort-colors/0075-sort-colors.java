class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int start = 0; // denotes for 0 
        int end = n - 1; // denotes for 2
        int i = 0; // denotes for 1
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
                // for 2
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