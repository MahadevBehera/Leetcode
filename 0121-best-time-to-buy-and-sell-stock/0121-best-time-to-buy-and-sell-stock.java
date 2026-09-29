class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0]; // considering buying the stock on first day initially
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            // ith day the price is more than my buying price, book profit can possible
            if (buy < prices[i]) {
                // Book profit and compare the previous profit
                int profit = prices[i] - buy;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // if the current day (ith) price is lesser than my buying price then we can buy on ith day
                buy = prices[i];
            }
        }

        return maxProfit;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna