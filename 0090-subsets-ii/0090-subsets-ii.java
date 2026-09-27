class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // required
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int powSize = 1 << n; // 1 * 2^n = 2^n (x << y = x*2^y)

        // All Possible subsets - Power Set using Bitwise
        for (int i = 0; i < powSize; i++) {
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { // check the bit is set or not
                    subList.add(nums[j]);
                }
            }
            if (!result.contains(subList))
                result.add(subList);
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna