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
		
		/*
		// Iterative function for pow(x, y)
		
		int res = 1;

          while (y > 0) {

              // if y is odd, last bit is 1 so include this power
              if ((y & 1) == 1) {
                  res = res * x;
              }

              // square the base
              x = x * x;

              // move to next bit
              y = y >> 1;
          }

          return res;
		*/
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna