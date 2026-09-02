class Solution {
    public static int countDigits(int n) {
        // Code here
		int res = 0;
		while (n > 0) {
			n = n/10;
			res++;
		}
		return res;
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna