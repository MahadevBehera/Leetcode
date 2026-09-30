class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            // Trick : (nums[i] - 1) is equal to a valid index in the array because array elements are 
            // in the range of [1, n]
            // getting ith index value and substracting by 1 to get index within range of 0 to n
            int index = Math.abs(nums[i]) - 1;

            // If the element at that index is already negative, we found a duplicate
            if (nums[index] < 0) {
                // we already reduced by 1 to get 0 based index, so to get actual value we need to add by 1
                result.add(index + 1); // actually adding previous value of nums[i], now we can't use as its negative now, so using (index + 1)
            } else {
                // Otherwise, mark it as visited by turning it's value to negative
                nums[index] = -nums[index];
            }
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna