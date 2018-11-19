/**
 * 463. 岛屿的周长
 * https://leetcode-cn.com/problems/island-perimeter/description/
 * Created by 老蹄子 on 2018/11/19 下午9:54
 */
class Solution {
    public int islandPerimeter(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int sum = 0;
        int m = grid.length;
        int n = grid[0].length;
        int[][]dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    sum += 4;
                    for (int[] dir : dirs) {
                        int x = i + dir[0];
                        int y = j + dir[1];
                        if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 1) {
                            sum--;
                        }
                    }
                }
            }
        }
        return sum;
    }
}
