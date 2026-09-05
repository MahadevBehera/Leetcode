class Solution {
	public int recursivePower(int n, int p) {
		// base case
		if (p == 0)
			return 1;
		
		int tmp = recursivePower(n, p/2);
		tmp = tmp * tmp;
		if (p%2 == 0) {
			return tmp;
		} else {
			return tmp * n;
		}
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna