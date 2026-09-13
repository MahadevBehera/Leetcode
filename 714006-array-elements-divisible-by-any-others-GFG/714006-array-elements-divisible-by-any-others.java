class Solution {
	public int cntSpecialNum(int arr[]) {
		
		Map<Integer, Integer> freqMap = new HashMap<>();
		int specialNumberCount = 0;
		
		// store the frequency of each elements in the map
		for (int x : arr) {
			freqMap.put(x, freqMap.getOrDefault(x, 0) + 1);
		}
		
		for (int x: arr) {
			freqMap.put(x, freqMap.get(x) - 1);
			boolean isSpecial = false;
			
			for (int i = 1; i*i <= x; i++) {
				if (x % i == 0) {
					if (freqMap.getOrDefault(i, 0) > 0) {
						isSpecial = true;
						break;
					}
					
					int div = x/i;
					if (div != i && freqMap.getOrDefault(div, 0) > 0) {
						isSpecial = true;
						break;
					}
				}
			}
			
			if (isSpecial) {
				specialNumberCount++;
			}
			freqMap.put(x, freqMap.get(x) + 1);
		}
		
		return specialNumberCount;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna