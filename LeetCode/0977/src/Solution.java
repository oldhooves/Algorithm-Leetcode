import java.util.Arrays;

/**
 * 977. 有序数组的平方
 * https://leetcode-cn.com/classic/problems/squares-of-a-sorted-array/description/
 * Created by ${laotizi} on 2019-03-20.
 */
class Solution {
    public int[] sortedSquares(int[] A) {
        int N = A.length;
        int[] ans = new int[N];
        for (int i = 0; i < N; ++i) {
            ans[i] = A[i] * A[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}