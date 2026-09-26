class Solution {
	boolean isPalindrome(String s) {
		return isPal(s, 0, s.length() - 1);
	}
	
	boolean isPal(String str, int start, int end) {
		if (start >= end) {
			return true;
		}
		
		return ((str.charAt(start) == str.charAt(end))
		 && isPal(str, start + 1, end - 1));
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna