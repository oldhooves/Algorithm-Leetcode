/**
 * 766. 托普利茨矩阵
 * https://leetcode-cn.com/problems/toeplitz-matrix/description/
 * Created by 老蹄子 on 2018/9/26 下午7:41
 */
class Solution {

    public boolean isToeplitzMatrix(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (matrix[i][j] != matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
