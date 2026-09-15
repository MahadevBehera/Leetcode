class CheckBit {
	static boolean checkKthBit(int n, int k) {
		int val = n & (1 << k);
		
		if (val != 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna