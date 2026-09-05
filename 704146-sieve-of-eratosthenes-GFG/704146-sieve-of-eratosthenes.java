class Solution {
	public ArrayList<Integer> sieve(int n) {
		// code here
		ArrayList<Integer> result = new ArrayList<>();
		boolean isPrime[] = new boolean[n + 1];
		for (int i = 2; i <= n; i++) {
			isPrime[i] = true;
		}
		
		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				result.add(i);
				for (int j = i*i; j <= n; j = j + i) {
					isPrime[j] = false;
				}
			}
		}
		return result;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna