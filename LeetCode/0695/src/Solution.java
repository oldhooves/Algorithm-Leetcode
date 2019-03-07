/**
 * 695. 岛屿的最大面积
 * https://leetcode-cn.com/classic/problems/max-area-of-island/description/
 * Created by 老蹄子 on 2019/3/7 下午7:24
 */
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max,AreaOfIsland(grid,i,j));
                }
            }
        }
        return max;
    }

    private int AreaOfIsland(int[][] grid, int i, int j) {
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1) {
            grid[i][j] = 0;
            return 1 + AreaOfIsland(grid,i + 1,j) +AreaOfIsland(grid,i - 1,j)
                    + AreaOfIsland(grid,i,j + 1) + AreaOfIsland(grid,i,j - 1);
        }
        return 0;
    }
}