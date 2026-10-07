class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        permute(nums, 0, set);
        return new ArrayList<>(set);
    }

    public void permute(int[] nums, int index, Set<List<Integer>> set) {
        // Base case
        if (index >= nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int n : nums) {
                list.add(n);
            }
            set.add(list);
        }

        for (int i = index; i < nums.length; i++) {
            // swap the element of index and i
            swapElements(nums, index, i);

            // fix the current element and call recursively for other elements in array
            permute(nums, index + 1, set);

            // Backtrack - swap the element of index and i again to restore back the array to previous position
            swapElements(nums, index, i);
        }
    }

    public void swapElements(int[] nums, int index, int i) {
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna