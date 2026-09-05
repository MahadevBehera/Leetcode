class Solution {
	public int countValid(int n, int[] arr) {
		// mark which digits are "good"
		boolean good[] = new boolean[10];
		for (int d : arr) {
			good[d] = true;
		}
		
		// count forbidden digits in f
		// and for the first position (f0)
		int f = 0;
		int f0 = 0;
		for (int d = 0; d < 10; d++) {
			if (!good[d]) {
				f++;
				if (d != 0)
					f0++;
			}
		}
		
		// total n-digit numbers = 9 * 10^(n-1)
		int total = 9 * pow(10, n - 1);
		
		// numbers with no good digit = f0 * f^(n-1)
		int notAllowed = (n == 1) ? f0 : f0 * pow(f, n - 1);
		
		// valid = total - notAllowed
		return total - notAllowed;
		
	}
	
	static int pow(int base, int exp) {
		int res = 1;
		while (exp > 0) {
			if ((exp & 1) == 1)
				res = res * base;
			
			base = base * base;
			exp = exp>> 1;
		}
		return res;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna