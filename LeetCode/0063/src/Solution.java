/**
 * 63. 不同路径 II
 * https://leetcode-cn.com/problems/unique-paths-ii/description/
 * Created by 老蹄子 on 2018/10/16 下午1:11
 */
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] != 1){
                res[i][0] = 1;
            }
            else {
                res[i][0] = 0;
                break;
            }
        }
        for (int j = 0; j < n; j++) {
            if (obstacleGrid[0][j] != 1){
                res[0][j] = 1;
            }else {
                res[0][j] = 0;
                break;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1){
                    res[i][j] = 0;
                }else {
                    res[i][j] = res[i - 1][j] + res[i][j - 1];
                }
            }
        }
        return res[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(new Solution().uniquePathsWithObstacles(obstacleGrid));
    }
}
