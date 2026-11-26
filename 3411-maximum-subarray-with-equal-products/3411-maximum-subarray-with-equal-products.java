class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            long product = 1;
            long gcd = 0;
            long lcm = 1;
            for (int j = i; j < n; j++) {
                product = product * nums[j];
                gcd = findGcd(gcd, nums[j]);
                lcm = findLcm(lcm, nums[j]);
                // product equivalent condition --> prod(arr) == lcm(arr) * gcd(arr)
                if (product == (gcd * lcm)) {
                    ans = Math.max(ans, (j - i + 1));
                }
            }
        }

        return ans;
    }

    // GCD function
    private long findGcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // LCM function
    private long findLcm(long a, long b) {
        return (a * b) / findGcd(a, b);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna