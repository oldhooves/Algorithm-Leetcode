/**
 * 730. 统计不同回文子字符串
 * https://leetcode-cn.com/problems/count-different-palindromic-subsequences/description/
 * Created by 老蹄子 on 2018/10/30 下午8:28
 */
class Solution {
    public int countPalindromicSubsequences(String S) {
        long mod = 1000000007;
        int n = S.length();
        int[][] dp = new int[n][n];
        char[] s = S.toCharArray();
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i < n - len; i++) {
                int j = i + len;
                if (s[i] == s[j]){
                    dp[i][j] = dp[i + 1][j - 1] * 2;
                    int l = i + 1;
                    int r = j - 1;
                    while (l <= r && s[l] != s[j]){
                        l++;
                    }
                    while (l <= r && s[r] != s[j]){
                        r--;
                    }
                    if (l == r){
                        dp[i][j] += 1;
                    }else if (l > r){
                        dp[i][j] += 2;
                    }else {
                        dp[i][j] -= dp[l + 1][r - 1];
                    }
                }else {
                    dp[i][j] = dp[i][j - 1] + dp[i + 1][j] - dp[i + 1][j - 1];
                }
                dp[i][j] = (int)((dp[i][j] + mod) % mod);
            }
        }
        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countPalindromicSubsequences("abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba"));
    }
}