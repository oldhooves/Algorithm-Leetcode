/**
 * 72. 编辑距离
 * https://leetcode-cn.com/problems/edit-distance/description/
 * Created by 老蹄子 on 2018/10/25 下午8:30
 */
class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] cost = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            cost[i][0] = i;
        }
        for (int i = 0; i <= n; i++) {
            cost[0][i] = i;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (word1.charAt(i) == word2.charAt(j)){
                    cost[i + 1][j + 1] = cost[i][j];
                }
                else {
                    cost[i + 1][j + 1] = Math.min(Math.min(cost[i + 1][j],cost[i][j + 1]),cost[i][j]) + 1;
                }
            }
        }

        return cost[m][n];
    }
}