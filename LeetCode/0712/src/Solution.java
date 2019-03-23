/**
 * 712. 两个字符串的最小ASCII删除和
 * https://leetcode-cn.com/classic/problems/minimum-ascii-delete-sum-for-two-strings/description/
 * Created by 老蹄子 on 2019/3/23 下午7:46
 */
class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    int a = 0;
                    for (int k = 1; k <= Math.max(j, i); k++) {
                        a += (i == 0 ? s2.charAt(k - 1) :s1.charAt(k - 1));
                    }
                    dp[i][j] = a;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(s1.charAt(i - 1) + dp[i - 1][j],s2.charAt(j - 1) + dp[i][j - 1]);
                    dp[i][j] = Math.min(dp[i][j],s1.charAt(i - 1) + s2.charAt(j - 1) + dp[i - 1][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}