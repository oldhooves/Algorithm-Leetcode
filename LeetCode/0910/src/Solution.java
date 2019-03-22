import java.util.Arrays;

/**
 * 910. 最小差值 II
 * https://leetcode-cn.com/classic/problems/smallest-range-ii/description/
 * Created by ${laotizi} on 2019-03-22.
 */
class Solution {
    public int smallestRangeII(int[] A, int K) {
        Arrays.sort(A);
        int n = A.length;
        int res = A[n - 1] - A[0];
        for (int i = 0; i < n - 1; i++) {
            int max = Math.max(A[i] + K, A[n - 1] - K);
            int min = Math.min(A[i + 1] - K, A[0] + K);
            res = Math.min(res,max - min);
        }
        return res;
    }
}