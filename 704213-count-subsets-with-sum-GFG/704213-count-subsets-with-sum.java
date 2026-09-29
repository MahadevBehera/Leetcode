class Solution {
	static int perfectSum(int[] arr, int target) {
		return countSubsetSum(arr, arr.length, target);
	}
	
	public static int countSubsetSum(int[] arr, int n, int sum) {
		if (n == 0) {
			return (sum == 0) ? 1 : 0;
		}
		return countSubsetSum(arr, n - 1, sum) + countSubsetSum(arr, n - 1, sum - arr[n - 1]);
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna