import java.util.Arrays;

/**
 * 1005. K 次取反后最大化的数组和
 * https://leetcode-cn.com/classic/problems/maximize-sum-of-array-after-k-negations/description/
 * Created by 老蹄子 on 2019/3/19 下午8:22
 */
class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        for (int i = 0; K > 0 && i < A.length && A[i] < 0; i++, K--) {
            A[i] = -A[i];
        }
        int res = 0,min = Integer.MAX_VALUE;
        for (int a : A) {
            res += a;
            min = Math.min(min,a);
        }
        return res - (K % 2) * min * 2;
    }
}
