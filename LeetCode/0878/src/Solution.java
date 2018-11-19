/**
 * 878. 第 N 个神奇数字
 * https://leetcode-cn.com/problems/nth-magical-number/description/
 * Created by 老蹄子 on 2018/11/19 下午1:58
 */
class Solution {
    public int nthMagicalNumber(int N, int A, int B) {
        long a = A, b = B, tmp, l = 2, r = (long)Math.min(A,B) * N, mod = (long)1e9 + 7;
        while (b > 0) {
            tmp = a;
            a = b;
            b = tmp % b;
        }
        while (l < r) {
            long m = (l + r) / 2;
            if (m / A + m / B - m / (A * B / a) < N){
                l = m + 1;
            }
            else {
                r = m;
            }
        }
        return (int)(l % mod);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().nthMagicalNumber(4,2,3));
    }
}