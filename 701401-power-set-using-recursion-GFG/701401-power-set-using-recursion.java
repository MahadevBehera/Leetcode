class Solution {
	public ArrayList<String> powerSet(String s) {
		ArrayList<String> result = new ArrayList<>();
		subSet(s, result, "", 0);
		return result;
	}
	
	public void subSet(String s, ArrayList<String> list, String curr, int index) {
		// base case when index is equal to s.length()
		if (index == s.length()) {
			list.add(curr);
			return;
		}
		
		subSet(s, list, curr, index + 1);
		subSet(s, list, curr + s.charAt(index), index + 1);
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna