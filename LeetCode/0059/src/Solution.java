/**
 * 59. 螺旋矩阵 II
 * https://leetcode-cn.com/problems/spiral-matrix-ii/description/
 * Created by 老蹄子 on 2018/10/2 上午11:05
 */
class Solution {
    public int[][] generateMatrix(int n) {

        int[][] res = new int[n][n];

        int total = n * n;
        int num = 1;

        int rowBegin = 0;
        int rowEnd = n - 1;
        int colBegin = 0;
        int colEnd = n - 1;

        while (num <= total){

            for (int y = colBegin; y <= colEnd; y++) {
                res[rowBegin][y] = num++;
            }
            rowBegin++;

            for (int x = rowBegin; x <= rowEnd; x++) {
                res[x][colEnd] = num++;
            }
            colEnd--;

            for (int y = colEnd; y >= colBegin; y--) {
                res[rowEnd][y] = num++;
            }
            rowEnd--;

            for (int x = rowEnd; x >= rowBegin; x--) {
                res[x][colBegin] = num++;
            }
            colBegin++;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] res = new int[n][n];
        res = new Solution().generateMatrix(n);
        System.out.println(res.toString());
    }
}
