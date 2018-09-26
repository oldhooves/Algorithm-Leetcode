/**
 * Created by 老蹄子 on 2018/9/26 下午10:31
 */
public class Solution2 {

    public int maxProfit(int[] prices) {

        if (prices.length < 2){
            return 0;
        }
        int low = prices[0];
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            low = Math.min(low,prices[i]);
            max = Math.max(max,prices[i]-low);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int res = new Solution2().maxProfit(prices);
        System.out.println(res);
    }
}
