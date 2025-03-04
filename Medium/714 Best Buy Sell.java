// For the problem located at: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/

class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[n][2];  // solving this as a dynamic programming problem
        for(int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return profit(0,0, prices, fee, dp);
    }
    public int profit(int index, int buy, int prices[], int fee, int dp[][]) {
        if(index == prices.length) {  // reached end of prices
            return 0;
        }
        if(dp[index][buy] != -1) {
            return dp[index][buy];
        }
        //need to buy
        if(buy == 0) {

            int purchase = -(prices[index] + fee) + profit(index+1, 1, prices, fee, dp);
            int skip = profit(index+1, 0, prices, fee, dp);
            if(purchase > skip) {
                return dp[index][buy] = purchase;
            }
            else {
                return dp[index][buy] = skip;
            }

        }
        // need to sell
        int purchase = (prices[index]) + profit(index+1, 0, prices, fee, dp);
        int skip = profit(index+1, 1, prices, fee, dp);
        if(purchase > skip) {
            return dp[index][buy] = purchase;
        }
        else {
            return dp[index][buy] = skip;
        }
    }
}
