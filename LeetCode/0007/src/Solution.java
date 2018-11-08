import java.math.BigInteger;

/**
 * 7. 反转整数
 * https://leetcode-cn.com/problems/reverse-integer/description/
 * Created by 老蹄子 on 2018/11/8 下午3:58
 */
class Solution {
    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            if (result > Integer.MAX_VALUE) {
                return 0;
            }
            if (result < Integer.MIN_VALUE) {
                return 0;
            }
            x /= 10;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(1534236469));
    }
}