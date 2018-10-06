import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 73. 矩阵置零
 * https://leetcode-cn.com/problems/set-matrix-zeroes/description/
 * Created by 老蹄子 on 2018/10/6 下午7:42
 */
class Solution {

    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for (Integer factor : row) {
            rowZero(matrix,n,factor);
        }

        for (Integer factor : col) {
            colZero(matrix,m,factor);
        }

        return;
    }

    private void rowZero(int[][] matrix,int n,int row){
        for (int i = 0; i < n; i++) {
            matrix[row][i] = 0;
        }
    }

    private void colZero(int[][] matrix,int m,int col){
        for (int i = 0; i < m; i++) {
            matrix[i][col] = 0;
        }
    }


}
