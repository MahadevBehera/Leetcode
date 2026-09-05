class Solution {
	public int modInverse(int n, int m) {
		// code here
		if (gcd(n, m) != 1)
			return - 1;
		
		int m0 = m;
		int y = 0;
		int x = 1;
		
		if (m == 1)
			return 0;
		
		while (n>1) {
			// q is quotient
			int q = n / m ;
			int t = m;
			// m is remainder now, process same as Euclid's algo
			m = n % m;
			n = t;
			t = y;
			
			// update y and x
			y = x - q * y;
			x = t;
		}
		
		// make x positive
		if (x < 0)
			x = x + m0;
		
		return x;
		
	}
	
	static int gcd(int a, int b) {
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna