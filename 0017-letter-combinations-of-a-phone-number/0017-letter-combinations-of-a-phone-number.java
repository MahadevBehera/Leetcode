class Solution {
    public List<String> letterCombinations(String digits) {
        String[] padMap = {
                "", "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };

        List<String> result = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        solve(digits, 0, padMap, result, temp);
        return result;
    }

    public void solve(String digits, int index, String[] padMap, List<String> result, StringBuilder temp) {
        // Base case
        if (index == digits.length()) {
            result.add(temp.toString());
            return;
        }

        int digit = digits.charAt(index) - '0'; // converting char to int ('2' - '0' = 2)
        String mapStr = padMap[digit];

        // Skip invalid digit
        /*
        if (digit < 2 || digit > 9) {
            solve(digits, index + 1, padMap, result, temp);
            return;
        }
        */

        for (int i = 0; i < mapStr.length(); i++) {
            // Backtracking method
            // 1. Do something
            // 2. Explore
            // 3. Revert/Rollback to previous state which was done on step 1 and proceed further

            // 1. Do something ---> store ith char to temp (fixing the current char)
            temp.append(mapStr.charAt(i));
            // 2. Explore ---> calling for index+1 to get combination using next element in arr
            solve(digits, index + 1, padMap, result, temp);
            // 3. Revert/Rollback step 1 --> remove the fixed last char from temp which was stored on step 1
            temp.deleteCharAt(temp.length() - 1); // removing last char (Backtracking to previous state)
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna