/**
 * Created by 老蹄子 on 2018/10/4 下午9:04
 */
public class Solution2 {
    public int minPathSum(int[][] grid) {
        if (grid == null){
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;

        int[] dp = new int[col];
        dp[0] = grid[0][0];

        for (int j = 1; j < col; j++) {
            dp[j] = dp[j - 1] + grid[0][j];
        }

        for (int i = 1; i < row; i++) {
            dp[0] = dp[0] + grid[i][0];
            for (int j = 1; j < col; j++) {
                dp[j] = Math.min(dp[j - 1],dp[j]) + grid[i][j];
            }
        }

        return dp[col - 1];

    }
}
