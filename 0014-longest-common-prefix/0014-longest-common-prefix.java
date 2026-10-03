class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Optimised approach using sorting 
        // after sorting the 1st and last(strs.length - 1) String only we need to compare, we will get common longest prefix
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        StringBuilder longestCommonPrefix = new StringBuilder();
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                longestCommonPrefix.append(first.charAt(i));
            } else {
                return longestCommonPrefix.toString(); // return immediately when not matching the characters 
            }
        }

        return longestCommonPrefix.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna