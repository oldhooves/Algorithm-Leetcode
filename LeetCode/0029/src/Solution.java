/**
 * 29. 两数相除
 * https://leetcode-cn.com/problems/divide-two-integers/description/
 * Created by 老蹄子 on 2018/11/14 下午2:56
 */
class Solution {
    public int divide(int dividend, int divisor) {
        int sign = 1;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
            sign = -1;
        }
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        if (ldividend < ldivisor) {
            return 0;
        }
        long lans = ldivide(ldividend,ldivisor);
        int ans;
        if (lans > Integer.MAX_VALUE) {
            ans = (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }else {
            if (sign > 0) {
                return (int)lans;
            }else {
                return (int)(-lans);
            }
        }
        return ans;
    }

    private long ldivide(long ldividend, long ldivisor) {
        if (ldividend < ldivisor) {
            return 0;
        }
        long sum = ldivisor;
        long multiple = 1;
        while ((sum + sum) <= ldividend) {
            sum += sum;
            multiple += multiple;
        }
        return multiple + ldivide(ldividend - sum,ldivisor);
    }
}