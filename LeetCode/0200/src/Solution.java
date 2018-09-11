/**
 * 200. 岛屿的个数
 * https://leetcode-cn.com/problems/number-of-islands/description/
 * Created by 老蹄子 on 2018/9/11 下午7:29
 */
class Solution {

    private int d[][] = {{-1,0},{0,1},{1,0},{0,-1}};
    private int m,n;
    private boolean visited[][];


    public int numIslands(char[][] grid) {

        if(grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;

        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];

        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]){
                    dfs(grid,i,j);
                    res ++;
                }
            }
        }

        return res;
    }

    private void dfs(char[][] grid,int x,int y){

        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newX = x + d[i][0];
            int newY = y + d[i][1];
            if (inArea(newX,newY) && !visited[newX][newY] && grid[newX][newY] == '1'){
                dfs(grid,newX,newY);
            }
        }

        return;
    }

    private boolean inArea(int x, int y){
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    public static void main(String[] args) {
        char grid1[][] = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        System.out.println((new Solution()).numIslands(grid1));
    }
}
