class Solution {
	public int towerOfHanoi(int n, int from, int to, int aux) {
		int moves = 0;
		moves = TOH(moves, n, from, to, aux);
		return moves;
	}
	
	int TOH(int moves, int n, int from, int to, int aux) {
		if (n == 0) {
			return moves;
		}
		
		moves = TOH(moves, n - 1, from, aux, to);
		moves++;
		moves = TOH(moves, n - 1, aux, to, from);
		return moves;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna