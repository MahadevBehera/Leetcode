class Solution {
	public List<String> powerSet(String s) {
		List<String> result = new ArrayList<>();
		int n = s.length();
		int powSize = (1 << n); // 2^n
		
		for (int i = 0; i < powSize; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) { // check the bit is set or not
					sb.append(String.valueOf(s.charAt(j)));
				}
			}
			result.add(sb.toString());
		}
		Collections.sort(result); // for lexicographical order, means sorted order
		return result;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna