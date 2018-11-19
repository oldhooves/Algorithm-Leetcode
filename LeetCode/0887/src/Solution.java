/**
 * 887. 鸡蛋掉落
 * https://leetcode-cn.com/problems/super-egg-drop/description/
 * Created by 老蹄子 on 2018/11/19 下午1:13
 */
class Solution {
    public int superEggDrop(int K, int N) {
        int[][] dp = new int[N + 1][K + 1];
        int m = 0;
        while (dp[m][K] < N) {
            m++;
            for (int k = 1; k <= K; k++) {
                dp[m][k] = dp[m - 1][k - 1] + dp[m - 1][k] + 1;
            }
        }
        return m;
    }
}