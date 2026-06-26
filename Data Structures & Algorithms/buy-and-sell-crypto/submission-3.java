class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int i = 0;
        int j = 0;
        int n = prices.length;
        int buy = prices[0];

        while(j < n)
        {
            int sell = prices[j] - buy;
            if(sell < 0){
                i++;
                buy = prices[i];
            }
            profit = Math.max(sell,profit);
            j++;
        }
        return profit;
    }
}
