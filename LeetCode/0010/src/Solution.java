/**
 * 10. 正则表达式匹配
 * https://leetcode-cn.com/problems/regular-expression-matching/description/
 * Created by 老蹄子 on 2018/11/2 下午1:52
 * 对于s和p，设各个最后一个字符为x, y，p的倒数第二字符为z，除此外前面字符设为S,P，则：
    s = Sx
    p = Pzy
    如果x == y或y == '.'，则如果S和Pz匹配，则s和p匹配，因为最后两字字母是匹配的。这就缩减了问题规模。
    而对于y ==  '*'的情况，需要考虑z：
    如果x != z，则只有在s和P匹配的情况下，s和p才匹配。
    如果x == z，设匹配符号为~吧，方便，则如果S~P，S~Pz，S~Pzy，Sx~P，Sx~Pz，都可得出s和p匹配。

 */
class Solution {
    public boolean isMatch(String s, String p) {

        if (s == null || p == null) {
            return false;
        }

        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '*' && dp[0][i - 1]){
                dp[0][i + 1] = true;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == '.') {
                    dp[i + 1][j + 1] = dp[i][j];
                }
                if (p.charAt(j) == s.charAt(i)) {
                    dp[i + 1][j + 1] = dp[i][j];
                }
                if (p.charAt(j) == '*') {
                    if (p.charAt(j - 1) != s.charAt(i) && p.charAt(j - 1) != '.') {
                        dp[i + 1][j + 1] = dp[i + 1][j - 1];
                    }else {
                        dp[i + 1][j + 1] = (dp[i + 1][j] || dp[i + 1][j - 1] || dp[i][j + 1] || dp[i][j - 1] || dp[i][j]);
//                        dp[i + 1][j + 1] = (dp[i + 1][j] || dp[i + 1][j - 1] || dp[i][j + 1]);//dp[i][j + 1] 多个
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isMatch("aab","c*a*b"));
    }
}
