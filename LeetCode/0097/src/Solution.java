/**
 * 97. 交错字符串
 * https://leetcode-cn.com/problems/interleaving-string/description/
 * Created by 老蹄子 on 2018/10/30 下午7:28
 * https://segmentfault.com/a/1190000010320596
 */
class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        if ((len1 + len2) != len3){
            return false;
        }
        boolean[][] matrix = new boolean[len2 + 1][len1 + 1];
        matrix[0][0] = true;
        for (int i = 1; i <= len1; i++) {
            matrix[0][i] = matrix[0][i - 1] && s1.charAt(i - 1) == s3.charAt(i - 1);
        }
        for (int i = 1; i <= len2; i++) {
            matrix[i][0] = matrix[i - 1][0] && s2.charAt(i - 1) == s3.charAt(i - 1);
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                matrix[i][j] = (matrix[i - 1][j] && s2.charAt(i - 1) == s3.charAt(i + j - 1)
                        || matrix[i][j - 1] && s1.charAt(j - 1) == s3.charAt(i + j - 1));
            }
        }

        return matrix[s2.length()][s1.length()];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isInterleave("aabcc","dbbca","aadbbcbcac"));
    }
}