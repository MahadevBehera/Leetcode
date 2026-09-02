class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> res = new HashSet<>();

        for (int num : nums) {
            if (num <= 1) {
                continue;
            }

            for (int i = 2; i * i <= num; i++) {
                while (num % i == 0) {
                    res.add(i);
                    num = num / i;
                }
            }

            if (num != 1) {
                res.add(num);
            }
        }
        return res.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna