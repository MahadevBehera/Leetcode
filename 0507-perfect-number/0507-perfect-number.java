class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; (i * i) <= num; i++) {
            if ((num % i) == 0) {
                sum = sum + i;
                if ((num / i) != i) {
                    sum = sum + (num / i);
                }
            }
        }
        return (sum - num) == num; // (sum - num), because to remove the num it self from divisors 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna