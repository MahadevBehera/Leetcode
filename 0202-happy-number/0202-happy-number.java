class Solution {
    public boolean isHappy(int n) {
        // if the number is not Happy number,
        // then after some time the sum repeats again so its an endless loop
        // we can solve this using Floyd's Cycle Finding Algorithm
        int slow = getSumOfNextNumber(n);
        int fast = getSumOfNextNumber(getSumOfNextNumber(n));

        while (slow != fast) {
            if (fast == 1)
                return true;
            slow = getSumOfNextNumber(slow);
            fast = getSumOfNextNumber(getSumOfNextNumber(fast));
        }
        return slow == 1;
    }

    private int getSumOfNextNumber(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = (n % 10);
            sum = sum + (digit * digit);
            n = n / 10;
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna