class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxprof = Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            mini = Math.min(mini,prices[i]);
            int profit = prices[i] - mini;
            maxprof = Math.max(maxprof,profit);
        }

        return maxprof;
    }
}