class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            // to handle columnNumber = 26, so 26 % 26 = 0, but it should be 65('A') + 25 = 90 (ASCII value of Z)
            columnNumber--;
            int remainder = columnNumber % 26;
            result.insert(0, (char) (remainder + 'A'));
            columnNumber = columnNumber / 26;
        }
        return result.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna