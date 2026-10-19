class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int index = 0;
        int count = 0;
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (num < target) {
                index++;
            } else if (num == target) {
                count++;
            }
        }
        while (count != 0) {
            result.add(index++);
            count--;
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna