class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] frequencyArr = new char[26];
            //Count frequency of each letter in the String
            for (char c : s.toCharArray()) {
                frequencyArr[c - 'a']++;
            }
            // frequencyArr is a char array, so String will be formed using the characters
            String key = new String(frequencyArr);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    /*
    Time complexity: O(m * n)
    Space complexity: O(mn)
    */
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna