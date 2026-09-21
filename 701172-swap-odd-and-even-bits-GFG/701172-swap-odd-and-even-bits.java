class Solution {
	public int swapBits(int n) {
		// get all even bits of n
		// using 0xAAAAAAAA which has all even bits set as '1' and all odd bits set as '0'
		int even_bits = n & 0xAAAAAAAA;
		// get all odd bits of n
		// using 0x55555555 which has all even bits set as '0' and all odd bits set as '1'
		int odd_bits = n & 0x55555555;
		
		// Right shift even bits
		even_bits = even_bits>> 1;
		
		// Left shift odd bits
		odd_bits = odd_bits << 1;
		
		// Combine even and odd bits
		return (even_bits | odd_bits);
		
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna