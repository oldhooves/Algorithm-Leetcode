/**
 * 121. 买卖股票的最佳时机
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/description/
 * Created by 老蹄子 on 2018/9/26 下午10:19
 */
class Solution {

    public int maxProfit(int[] prices) {

        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]){
                    int temp = prices[j] - prices[i];
                    res = Math.max(res,temp);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int res = new Solution().maxProfit(prices);
        System.out.println(res);
    }
}