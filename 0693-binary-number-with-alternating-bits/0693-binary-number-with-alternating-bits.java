class Solution {
    public boolean hasAlternatingBits(int n) {
        //If a number has alternating bits (like 101010...), then shifting it right by 1 bit will create an opposite pattern.
        // When we XOR the number with its right-shifted version, If the bits were perfectly alternating, the result will be a sequence of all 1s (e.g., 11111...).
        int x = n ^ (n >> 1);

        // if a number that has all bits set ('1') then by adding 1 to the number of all 1s produces a power of two and AND them with the number will give 0, (checking Power of 2 logic)
        return (x & (x + 1)) == 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna