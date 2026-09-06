class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        String vowels = "aeiou";
        for (int i = left; i <= right; i++) {
            char arr[] = words[i].toCharArray();
            if ((vowels.indexOf(arr[0]) != -1)
                    &&
                    (vowels.indexOf(arr[arr.length - 1]) != -1)) {
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna