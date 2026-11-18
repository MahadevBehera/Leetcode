class Solution {
    public int minChanges(String s) {
        int n = s.length();
        int changes = 0;

        for (int i = 0; i < n; i = i + 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                changes++;
            }
        }

        return changes;
    }

    /*
    Time : O(n)
    Space : O(1)
    */
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna