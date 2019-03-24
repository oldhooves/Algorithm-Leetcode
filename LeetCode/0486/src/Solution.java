/**
 * 486. 预测赢家
 * https://leetcode-cn.com/classic/problems/predict-the-winner/description/
 * Created by 老蹄子 on 2019/3/24 下午4:29
 */
class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = nums[i];
        }
        for (int len = 1; len < n; len++) {
            for (int i = 0; i < n - len; i++) {
                int j = len + i;
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j],nums[j] - dp[i][j - 1]);
            }
        }
        return dp[0][n - 1] >= 0;
    }
}