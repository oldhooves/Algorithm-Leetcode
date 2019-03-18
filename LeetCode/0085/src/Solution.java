/**
 * 85. 最大矩形
 * https://leetcode-cn.com/classic/problems/maximal-rectangle/description/
 * Created by 老蹄子 on 2019/3/18 下午9:29
 */
class Solution {
    public int maximalRectangle(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    matrix[i][j] = (char) (matrix[i][j-1] + 1);
                } else {
                    matrix[i][j] = '0';
                }
            }
        }
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int min = matrix[i][j] - '0';
                if (min > 0) {
                    max = Math.max(max,min);
                    for (int k = i - 1; k >= 0 && matrix[k][j] != '0'; k--) {
                        min = Math.min(min,matrix[k][j] - '0');
                        max = Math.max(max,min * (i - k + 1));
                    }
                }
            }
        }
        return max;
    }
}
