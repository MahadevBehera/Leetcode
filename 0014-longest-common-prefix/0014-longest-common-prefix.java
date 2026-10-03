class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Brute Force approach
        String longestCommonPrefix = strs[0];
        StringBuilder tempCommon = new StringBuilder();
        for (String word : strs) {
            int wordLen = word.length();
            int len = longestCommonPrefix.length(); // it should be here as longestCommonPrefix is updated in each iteration 
            int i = 0;
            while (i < len && i < wordLen && (longestCommonPrefix.charAt(i) == word.charAt(i))) {
                tempCommon.append(longestCommonPrefix.charAt(i));
                i++;
            }

            longestCommonPrefix = tempCommon.toString();
            tempCommon.setLength(0); // clearing the tempCommon, means reseting to empty
        }
        return longestCommonPrefix;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna