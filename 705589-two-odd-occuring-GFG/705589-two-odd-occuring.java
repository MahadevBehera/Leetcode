class Solution {
	ArrayList<Integer> twoOddNum(int[] arr) {
		int x = 0;
		for (int n : arr) {
			x = x ^ n;
		}
		
		//int k = x & (~(x - 1));
		int k = x & -x; // ~(x - 1) = -x
		int res1 = 0, res2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & k) != 0) {
				res1 = res1 ^ arr[i];
			}
			else {
				res2 = res2 ^ arr[i];
			}
		}
		
		ArrayList<Integer> result = new ArrayList<>();
		if (res1 > res2) {
			result.add(res1);
			result.add(res2);
		}
		else {
			result.add(res2);
			result.add(res1);
		}
		
		return result;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna