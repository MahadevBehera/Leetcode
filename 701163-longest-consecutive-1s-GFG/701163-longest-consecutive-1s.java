class Solution {
	public static int maxConsecutiveOnes(int n) {
		int count = 0;
		// count the number of iteration to reach the n = 0
		while (n != 0) {
			// This reduce the length of every sequence of 1s by one
			n = n & (n << 1);
			count++;
		}
		return count;
		
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna