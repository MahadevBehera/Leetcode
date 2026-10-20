class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int low = 1;
        int high = x;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            long square = (long) mid * (long) mid;
            if (square == (long) x) {
                return mid;
            } else if (square > (long) x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna