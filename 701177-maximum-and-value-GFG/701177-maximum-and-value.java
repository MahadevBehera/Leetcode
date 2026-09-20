class Solution {
	public int maxAND(int[] arr) {
		int n = arr.length;
		int result = 0;
		
		// iterate over total of 32 bits from MSB to LSB
		for (int bit = 31; bit >= 0; bit--) { // checking each bit, by looping bit by bit
			int mask = (1 << bit); // moving 1 bit to desired bit to do further operation
			int pattern = result | mask; // to preserve the values of previous bits doing OR operation
			int count = checkBit(pattern, arr); // find the count of array element having Set ('1') in MSB
			
			// if there are 2 or more '1' bit present in the desired bit location then AND operation is possible,
			// other wise result of AND will be Zero ('0')
			if (count >= 2) {
				result = result | mask; // basiccaly result will be equal to 'pattern'
			}
		}
		
		return result;
		
	}
	
	// Function to check count of elements having Set ('1') in MSB equal to 'pattern'
	public static int checkBit(int pattern, int arr[]) {
		int n = arr.length;
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			if ((pattern & arr[i]) == pattern) { // checking after AND its equal to pattern or not
				count++;
			}
		}
		
		return count;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna