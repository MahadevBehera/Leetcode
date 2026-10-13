class Solution {
	public ArrayList<String> possibleWords(int[] arr) {
		String[] padMap = {
			"", "",
			"abc",
			"def",
			"ghi",
			"jkl",
			"mno",
			"pqrs",
			"tuv",
			"wxyz"
		};
		
		ArrayList<String> result = new ArrayList<>();
		StringBuilder temp = new StringBuilder();
		solve(arr, 0, padMap, result, temp);
		return result;
	}
	
	public void solve(int[] arr, int index, String[] padMap, ArrayList<String> result, StringBuilder temp) {
		// Base case
		if (index == arr.length) {
			result.add(temp.toString());
			return;
		}
		
		int digit = arr[index];
		String mapStr = padMap[digit];
		
		// Skip invalid digit
		if (digit < 2 || digit > 9) {
			solve(arr, index + 1, padMap, result, temp);
			return;
		}
		
		for (int i = 0; i < mapStr.length(); i++) {
			// Backtracking method
			// 1. Do something
			// 2. Explore
			// 3. Revert/Rollback to previous state which was done on step 1 and proceed further
			
			// 1. Do something ---> store ith char to temp (fixing the current char)
			temp.append(mapStr.charAt(i));
			// 2. Explore ---> calling for index+1 to get combination using next element in arr
			solve(arr, index + 1, padMap, result, temp);
			// 3. Revert/Rollback step 1 --> remove the fixed last char from temp which was stored on step 1
			temp.deleteCharAt(temp.length() - 1); // removing last char (Backtracking to previous state)
			
		}
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna