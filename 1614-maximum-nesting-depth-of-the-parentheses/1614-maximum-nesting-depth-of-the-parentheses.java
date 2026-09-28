class Solution {
    public int maxDepth(String s) {

        int maxDepth = 0;
        int tmpDepth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                tmpDepth++;
            } else if (c == ')') {
                tmpDepth--;
            }

            if (maxDepth < tmpDepth)
                maxDepth = tmpDepth;
        }
        return maxDepth;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna