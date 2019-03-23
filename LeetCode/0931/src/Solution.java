import java.util.Arrays;

/**
 * 931. 下降路径最小和
 * https://leetcode-cn.com/classic/problems/minimum-falling-path-sum/description/
 * Created by 老蹄子 on 2019/3/23 下午9:55
 */
class Solution {
    public int minFallingPathSum(int[][] A) {
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                A[i][j] += Math.min(A[i - 1][j], Math.min(A[i - 1][Math.max(0, j - 1)], A[i - 1][Math.min(A.length - 1, j + 1)]));
            }
        }
//        return Arrays.stream(A[A.length - 1]).min().getAsInt();
        int min = Integer.MAX_VALUE;
        for (int i : A[A.length - 1]) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}