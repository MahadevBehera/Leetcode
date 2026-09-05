class Solution {
    public double myPow(double x, int n) {
        if (n < 0) {
            n = -n; // -(-n)
            x = 1 / x;
        }

        double res = 1;
        while (n != 0) {
            if ((n & 1) == 1) { // equivalent to if((n % 2) != 0) i.e. multiply only when the number is odd  
                res = res * x;
            }

            x = x * x;
            n = n >>> 1; // equivalent to n = n / 2; i.e. keep dividing the number by 2
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna