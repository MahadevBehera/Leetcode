class Solution {
    static int sumOfDigits(int n) {
        int res = 0;
        while (n > 0) {
            res = res + (n % 10);
            n = n/10;
        }
        return res;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna