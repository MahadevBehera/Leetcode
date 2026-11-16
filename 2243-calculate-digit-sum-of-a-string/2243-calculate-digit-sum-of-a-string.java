class Solution {
    public String digitSum(String s, int k) {
        if (s.length() <= k)
            return s;
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int digit = c - '0';
            sum = sum + digit;
            count++;
            if (count == k || (i == s.length() - 1)) {
                count = 0;
                sb.append(sum);
                sum = 0;
            }
            if ((i == s.length() - 1) && sb.length() > k) {
                s = sb.toString();
                sb.setLength(0);
                i = -1;
            }
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna