/**
 * 32. 最长有效括号
 * https://leetcode-cn.com/problems/longest-valid-parentheses/description/
 * Created by 老蹄子 on 2018/10/31 下午3:14
 */
class Solution {
    public int longestValidParentheses(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        char[] chars = s.toCharArray();
        int[] dp = new int[chars.length];
        int pre = 0;
        int res = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == ')'){
                pre = i - dp[i - 1] - 1;
                if (pre >= 0 && chars[pre] == '('){
                    dp[i] = dp[i - 1] + 2 + (pre > 0 ? dp[pre - 1] : 0);
                }
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestValidParentheses("()(())"));
    }
}