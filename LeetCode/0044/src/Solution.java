/**
 * 44. 通配符匹配
 * https://leetcode-cn.com/problems/wildcard-matching/description/
 * Created by 老蹄子 on 2018/11/1 下午7:56
 */
class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int i = 1; i <= p.length(); i++) {
            if (p.charAt(i - 1) == '*'){
                dp[0][i] = dp[0][i - 1];
            }
        }
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    for (int k = 0; k <= i; k++) {
                        if (dp[k][j - 1] == true) {
                            dp[i][j] = true;
                            break;
                        }
                    }
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[s.length()][p.length()];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isMatch("adceb","*a*b"));
    }
}
