import java.util.Arrays;

/**
 * 891. 子序列宽度之和
 * https://leetcode-cn.com/problems/sum-of-subsequence-widths/description/
 * Created by 老蹄子 on 2018/11/19 下午3:19
 */
class Solution {
    public int sumSubseqWidths(int[] A) {
        Arrays.sort(A);
        int len = A.length;
        long c = 1,res = 0,mod = (long)1e9 + 7;
        for (int i = 0; i < len; i++,c = (c * 2) % mod) {
            res = (res + A[i] * c - A[len - i - 1] * c) % mod;
        }
        return (int)res;
    }

    public static void main(String[] args) {
        int[] A = {2,1,3};
        System.out.println(new Solution().sumSubseqWidths(A));
    }
}
