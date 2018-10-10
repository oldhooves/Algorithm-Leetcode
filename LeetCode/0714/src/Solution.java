/**
 * 714. 买卖股票的最佳时机含手续费
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/
 * Created by 老蹄子 on 2018/10/10 下午8:10
 */
class Solution {
    public int maxProfit(int[] prices, int fee) {
        if (prices.length == 0){
            return 0;
        }
        //dp[i][0]代表第i天手中没有股票时能赚的最高价，dp[i][1]代表第i天手中有股票时所赚的最高价
        int[][] dp = new int[50000][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][1] + prices[i] - fee,dp[i - 1][0]);
            dp[i][1] = Math.max(dp[i - 1][0] - prices[i],dp[i - 1][1]);
        }
        return dp[prices.length - 1][0];
    }
}
