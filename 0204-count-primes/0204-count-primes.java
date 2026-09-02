class Solution {
    public int countPrimes(int n) {
        int sum = 0;
        boolean isNotPrime[] = new boolean[n + 1];

        for (int i = 2; i * i < n; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j < n; j = j + i) {
                    isNotPrime[j] = true;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i])
                sum++;
        }

        return sum;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna