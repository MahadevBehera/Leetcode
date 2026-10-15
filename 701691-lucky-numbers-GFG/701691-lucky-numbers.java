class Solution {
	public static boolean isLucky(int n) {
		int counter = 2;
		// Loop continues as long as counter <= n
		while (counter <= n) {
			// if the position is a multiple of counter, It's eliminated
			if (n % counter == 0) {
				return false;
			}
			// calculate the next position of input number
			n = n - (n/counter);
			// Increment the step size
			counter++;
		}
		// if we break out of loop, then the number is survived
		return true;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna