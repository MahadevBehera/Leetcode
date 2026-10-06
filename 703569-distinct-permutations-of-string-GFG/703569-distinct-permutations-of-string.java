class Solution {
	static ArrayList<String> findPermutation(String s) {
		Set<String> set = new HashSet<>();
		findPermute(new StringBuilder(s), 0, set);
		// Collections.sort(list);
		return new ArrayList(set);
	}
	
	static void findPermute(StringBuilder s, int index, Set<String> set) {
		// Base case - add string to set for unique
		if (index == s.length()) {
			set.add(s.toString());
			return;
		}
		
		for (int i = index; i < s.length(); i++) {
			// Swap the Characters of index & i
			char temp = s.charAt(index);
			s.setCharAt(index, s.charAt(i));
			s.setCharAt(i, temp);
			
			// Make Recursive call by fixing current position
			findPermute(s, index + 1, set);
			
			// Swap again to retain the previous String, so that we can perform next combination
			temp = s.charAt(index);
			s.setCharAt(index, s.charAt(i));
			s.setCharAt(i, temp);
		}
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna