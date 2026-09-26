class Solution {
	public int countDigits(int n) { // Recursion solution
		// Base case if n is a single digit
		if (n/10 == 0) {
			return 1;
		}
		return 1 + countDigits(n/10);
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna