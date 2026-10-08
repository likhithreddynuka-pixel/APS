class Solution {
    public int maxProfit(int[] prices) {
        int min, cost, profit, i;
        min = prices[0];
        profit = 0;
        
        for (i = 1; i < prices.length; i++) {
            cost = prices[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(min, prices[i]);
        }
        
        return profit;
    }
}