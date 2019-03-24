/**
 * 309. 最佳买卖股票时机含冷冻期
 * https://leetcode-cn.com/classic/problems/best-time-to-buy-and-sell-stock-with-cooldown/description/
 * Created by 老蹄子 on 2019/3/24 下午2:32
 */
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int b0 = -prices[0],b1 = b0;
        int s0 = 0,s1 = 0,s2 = 0;
        for (int i = 1; i < prices.length; i++) {
            b0 = Math.max(b1,s2 - prices[i]);
            s0 = Math.max(s1,b1 + prices[i]);
            b1 = b0;
            s2 = s1;
            s1 = s0;
        }
        return s0;
    }
}