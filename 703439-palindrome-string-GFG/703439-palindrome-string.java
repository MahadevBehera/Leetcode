class Solution {
	boolean isPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		while(start < end) {
		    if(s.charAt(start) != s.charAt(end)) {
		        return false;
		    }
		    start++;
		    end--;
		}
		return true;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna