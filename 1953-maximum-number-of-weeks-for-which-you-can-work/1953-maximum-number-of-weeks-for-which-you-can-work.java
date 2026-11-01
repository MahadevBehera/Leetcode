class Solution {
    public long numberOfWeeks(int[] milestones) {
        long totalSum = 0;
        long maxValue = 0;

        for (int i = 0; i < milestones.length; i++) {
            totalSum += milestones[i];
            if (maxValue < milestones[i]) {
                maxValue = milestones[i];
            }
        }

        // Sum of all other projects except the largest one
        long restSum = totalSum - maxValue;

        // The largest project is too dominant (maxValue > restSum + 1)
        if (maxValue > restSum + 1) {
            return (2 * restSum) + 1;
        } else {
            return totalSum;
        }

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna