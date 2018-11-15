/**
 * 233. 数字1的个数
 * https://leetcode-cn.com/problems/number-of-digit-one/description/
 * Created by 老蹄子 on 2018/11/14 下午9:55
 */
class Solution {
    public int countDigitOne(int n) {
        if (n < 1) {
            return 0;
        }
        if (n >= 1 && n < 10) {
            return 1;
        }
        int y = 1;
        int x = n;
        while (x >= 10) {
            x /= 10;
            y *= 10;
        }
        if (x == 1) {
            return n - y + 1 + countDigitOne(y - 1) + countDigitOne(n % y);
        }
        else {
            return y + x * countDigitOne(y - 1) + countDigitOne(n % y);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countDigitOne(824883294));
    }
}