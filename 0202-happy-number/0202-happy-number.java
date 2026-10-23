class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (!seen.contains(n)) {
            seen.add(n); // avoid checking for same number once again
            int sum = 0;
            while (n != 0) {
                int digit = (n % 10);
                sum = sum + (digit * digit);
                n = n / 10;
            }
            if (sum == 1) {
                return true;
            }
            n = sum; // sum is new number (n) now
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna