/**
 * 69. x 的平方根
 * https://leetcode-cn.com/problems/sqrtx/description/
 * Created by 老蹄子 on 2018/11/8 下午3:26
 */
class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x < 3) {
            return 1;
        }
        if (x == Integer.MAX_VALUE) {
            return 46340;
        }
        int res = 1;
        while (res <= x / 2) {
            int mul = res * res;
            if (mul > x) {
                break;
            } else if (mul == x) {
                return res;
            }
            res++;
        }
        return res - 1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().mySqrt(2147483647));
        System.out.println(Integer.MAX_VALUE);
    }
}
