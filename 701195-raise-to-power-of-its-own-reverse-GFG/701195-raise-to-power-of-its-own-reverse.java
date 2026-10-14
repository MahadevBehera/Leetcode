class Solution {
	public int reverseExponentiation(int n) {
		int reverse = 0;
		int temp = n;
		while (temp != 0) {
			reverse = (reverse * 10) + (temp % 10);
			temp = temp/10;
		}
		return power(n, reverse);
	}
	
	/*
	// Recursion 
	public int power(int n, int p) {
		if (p == 0) {
			return 1;
		}
		
		int tmp = power(n, p/2);
		tmp = tmp * tmp;
		if (p % 2 == 0) {
			return tmp;
		} else {
			return tmp * n;
		}
	}
	*/
	// Iterative
	public int power(int n, int p) {
		if (p == 0)
			return 1;
		int result = 1;
		while (p > 0) {
			// check p is odd or not
			if ((p & 1) == 1) {
				result = result * n;
			}
			
			n = n * n;
			p = p >>> 1;
		}
		return result;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna