class Solution {
	public static int posOfRightMostDiffBit(int m, int n) {
		int x = m ^ n;
		if (x == 0)
			return - 1;
		int result = 1;
		while ((x & 1) != 1) {
			result++;
			x = x>> 1;
		}
		
		return result;
		
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna