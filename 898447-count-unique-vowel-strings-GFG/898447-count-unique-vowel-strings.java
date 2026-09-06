class Solution {
	public static int vowelCount(String s) {
		HashMap<Character, Integer> freqOfVowels = new HashMap<>();
		String vowels = "aeiou";
		
		// Count frequency of each vowels in the String
		for (char c : s.toCharArray()) {
			if (vowels.indexOf(c) != -1) {
				freqOfVowels.put(c, freqOfVowels.getOrDefault(c, 0) + 1);
			}
		}
		
		// if there is no vowels then return 0
		if(freqOfVowels.isEmpty())
		    return 0;
		    
		int choices = 1;
		// Calculate choices based on frefrequency of vowels
		for(Map.Entry<Character, Integer> entry: freqOfVowels.entrySet()) {
		    choices = choices * entry.getValue();
		}
		
		int distinctVowelSize = freqOfVowels.size();
		
		//Calculate result as choices 
		//multiplied by factorial of distinct vowels
		int result = choices * factorial(distinctVowelSize);
		
		return result;
		
	}
	
	// calculate factorial of a number n
	public static int factorial(int n) {
	    int res = 1;
	    for(int i = 1; i <= n; i++) {
	        res = res * i;
	    }
	    return res;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna