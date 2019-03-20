/**
 * 861. 翻转矩阵后的得分
 * https://leetcode-cn.com/classic/problems/score-after-flipping-matrix/description/
 * Created by ${laotizi} on 2019-03-20.
 */
class Solution {
    public int matrixScore(int[][] A) {
        int N = A.length,M = A[0].length;
        //反转所有第一个元素为0的行
        for (int i = 0; i < N; i++) {
            if (A[i][0] == 0) {
                flipRow(A,i);
            }
        }
        //反转所有1的个数小于0个数的列
        for (int col = 1; col < M; col++) {
            int sumCol = 0;
            for (int i = 0; i < N; i++) {
                sumCol += A[i][col];
            }
            if (sumCol * 2 < N) {
                flipCol(A,col);
            }
        }

        int res = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                res += A[i][j] * (1 << (M - j - 1));
            }
        }
        return res;
    }

    private void flipRow(int[][] a, int r) {
        for (int i = 0; i < a[r].length; ++i)
            a[r][i] = (a[r][i] ^ 1);
    }

    private void flipCol(int[][] a, int c) {
        for (int i = 0; i < a.length; ++i)
            a[i][c] = (a[i][c] ^ 1);
    }

}