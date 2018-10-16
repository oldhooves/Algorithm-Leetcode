/**
 * 907. 子数组的最小值之和
 * https://leetcode-cn.com/problems/sum-of-subarray-minimums/description/
 * Created by 老蹄子 on 2018/10/16 下午5:06
 */
class Solution {
    public int sumSubarrayMins(int[] A) {
        long res = 0;
        long mod = 1000000007;
        for (int i = 0; i < A.length; i++) {
            int l = i - 1;
            for (;l >= 0 && A[i] < A[l]; l--);
            int r = i + 1;
            for (;r < A.length && A[i] <= A[r]; r++);
            res += (i - l) * (r - i) * A[i];
        }
        return (int)(res % mod);
    }

    public static void main(String[] args) {
        int[] A = {3,1,2,4};
        System.out.println(new Solution().sumSubarrayMins(A));
    }
}
