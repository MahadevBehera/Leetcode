class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        findPermute(nums, 0, res); // initially calling with index = 0
        return res;
    }

    public void findPermute(int[] nums, int index, List<List<Integer>> res) {
        // Base case - add nums to list
        if (index == nums.length) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int n : nums) {
                list.add(n);
            }
            res.add(list);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            // Swap the Characters of index & i
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

            // Make Recursive call by fixing current position
            findPermute(nums, index + 1, res);

            // Swap again to retain the previous String, so that we can perform next combination
            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna