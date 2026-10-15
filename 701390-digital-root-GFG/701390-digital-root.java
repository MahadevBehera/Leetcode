class Solution {
	public int digitalRoot(int n) {
		// If given number is Zero, then its digital sum will be zero only
		if (n == 0) {
			return 0;
		}
		// if result of modulo operation is zero,
		// means if remainder is zero when number is divided by 9,
		// then the digit sum is 9
		if (n % 9 == 0) {
			return 9;
		}
		
		// Digital root is equals to remainder when number is divided by 9
		return (n % 9);
	}
};


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna