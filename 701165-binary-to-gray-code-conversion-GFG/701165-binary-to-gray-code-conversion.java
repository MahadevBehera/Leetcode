class Solution {
	public int binaryToGray(int n) {
		// Gray Code property ---> Gray code = n ^ (n>>1)
		// Right shift n by 1 bit
		int res = n>> 1;
		
		// XOR the original number to get Gray Code
		return n ^ res;
		
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna