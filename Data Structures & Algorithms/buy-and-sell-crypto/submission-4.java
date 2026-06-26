class Solution {
    public int maxProfit(int[] prices) {
        int j = 1;
        int n = prices.length;
        int minBuy = prices[0];
        int maxProfit = 0;

        while(j < n)
        {
            int profit = prices[j] - minBuy;
            maxProfit = Math.max(maxProfit,profit);
            minBuy = Math.min(prices[j],minBuy);
            j++;
        }
        return maxProfit;
    }
}
