/**
 * 576. 出界的路径数
 * https://leetcode-cn.com/classic/problems/out-of-boundary-paths/description/
 * Created by ${laotizi} on 2019-03-12.
 */
class Solution {
    private int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    private int mod = 1000000000 + 7;

    public int findPaths(int m, int n, int N, int i, int j) {
        long[][][] memo = new long[m][n][N + 1];
        for (int ii = 0; ii < m; ii++) {
            for (int jj = 0; jj < n; jj++) {
                for (int kk = 0; kk < N + 1; kk++) {
                    memo[ii][jj][kk] = -1;
                }
            }
        }
        return (int)(dfs(m,n,N,i,j,memo) % mod);
    }

    private long dfs(int m, int n, int N, int i, int j, long[][][] memo) {
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return 1;
        }
        if (N == 0) {
            return 0;
        }
        if (memo[i][j][N] != -1) {
            return memo[i][j][N];
        }
        memo[i][j][N] = 0;
        for (int[] dir : dirs) {
            int x = dir[0] + i;
            int y = dir[1] + j;
            memo[i][j][N] = (memo[i][j][N] + dfs(m,n,N - 1,x,y,memo) % mod) % mod;
        }
        return memo[i][j][N];
    }
}