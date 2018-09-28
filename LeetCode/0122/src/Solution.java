/**
 * 122. 买卖股票的最佳时机 II
 * Created by ${laotizi} on 2018-09-28.
 */
class Solution {

    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2){
            return 0;
        }
        int sum = 0;
        for (int i = 1; i < len; i++) {
            int temp = prices[i] - prices[i-1];
            if ( temp > 0){
                sum += temp;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int res = new Solution().maxProfit(prices);
        System.out.println(res);
    }
}