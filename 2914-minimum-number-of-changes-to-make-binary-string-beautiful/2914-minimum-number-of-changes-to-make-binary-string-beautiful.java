class Solution {
    public int minChanges(String s) {
        int n = s.length();
        int ch = s.charAt(0);

        int count = 0;
        int changes = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ch) {
                count++;
                continue;
            }

            // current character c is not equal to ch
            if (count % 2 == 0) { // previous substring is even length or not
                count = 1; // start new substring
            } else {
                // c need to change to make even substring length
                changes++;
                count = 0;
            }
            ch = c; // update to new character
        }

        return changes;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna