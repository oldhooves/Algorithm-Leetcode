/**
 * 583. 两个字符串的删除操作
 * https://leetcode-cn.com/problems/delete-operation-for-two-strings/description/
 * Created by 老蹄子 on 2018/10/23 下午9:18
 */
class Solution {
    public int minDistance(String word1, String word2) {
        int common = lcs(word1,word2);
        return word1.length() + word2.length() - 2 * common;
    }

    private int lcs(String s,String t){
        if (s == null || s.length() == 0 || t == null || t.length() == 0){
            return 0;
        }
        int len1 = s.length();
        int len2 = t.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        int max = 0;
        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                if (i == 0 || j == 0){
                    dp[i][j] = 0;
                }else if (s.charAt(i - 1) == t.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i][j - 1]);
                }
                if (max < dp[i][j]){
                    max = dp[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().minDistance("sea", "eat"));
    }
}
