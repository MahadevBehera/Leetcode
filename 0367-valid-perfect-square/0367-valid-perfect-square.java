class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        int low = 1;
        int high = num / 2;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            long square = (long) mid * (long) mid;
            if (square == (long) num) {
                return true;
            } else if (square < (long) num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ((long) high * (long) high) == (long) num;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna