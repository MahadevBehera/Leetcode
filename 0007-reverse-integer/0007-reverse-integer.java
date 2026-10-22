class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        int reverse = 0;
        while (x != 0) {
            int digit = (x % 10);
            // checking the value is int overflow or not
            if (reverse > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        return isNegative ? -reverse : reverse;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna