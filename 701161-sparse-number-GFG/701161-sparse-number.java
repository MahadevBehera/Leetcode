class Solution {
	public static boolean isSparse(int n) {
		// n is not a Sparse number if there is set bit in AND of n and n/2 (n>>1).
		// Means after right shift n by 1 and doing AND operation between n with result,
		// then if there is max 1 consecutive set bit, the final result after AND will be zero.
		// Otherwise the result will contain 1's, mean value will be either 1 or more than 1.
		if((n & (n >> 1)) >= 1) {
		    return false;
		} 
		return true;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna